package az.rock.jobber.ws.domain.applicationService.ports.input.service.conc;

import az.rock.jobber.ws.messenger.request.GRequest;
import az.rock.jobber.ws.domain.applicationService.ports.input.service.abst.UserService;
import az.rock.jobber.ws.domain.applicationService.dto.create.CreateUserCommand;
import az.rock.jobber.ws.domain.applicationService.dto.create.CreateUserResponse;
import az.rock.jobber.ws.domain.applicationService.mapper.UserDataMapper;
import az.rock.jobber.ws.domain.applicationService.ports.input.service.CreateUserCommandHandler;
import az.rock.jobber.ws.domain.applicationService.ports.output.feign.EmployeePrivateFeignClient;
import az.rock.jobber.ws.domain.core.event.UserCreatedEvent;
import az.rock.jobber.ws.exception.GRuntimeException;
import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.annotation.Validated;

@Slf4j
@Validated
@Service
@RequiredArgsConstructor
public class UserManager implements UserService {
    private final CreateUserCommandHandler userCommandHandler;
    private final UserDataMapper userDataMapper;
    //private final UserMessagePublisher userMessagePublisher;
    private final EmployeePrivateFeignClient employeeFeignClient;

    @Override
    @Transactional
    @SneakyThrows(Exception.class)
    public CreateUserResponse createUser(CreateUserCommand userCommand) {
        UserCreatedEvent userCreatedEvent = this.userCommandHandler.createdEvent(userCommand);
        //TODO Publish edilmelidir kafkaya
        var response = this.employeeFeignClient.createEmployee(new GRequest(userCommand.getUserUUID()));
        if (!response.getSuccess()) throw new GRuntimeException();
        return this.userDataMapper.userToCreateUserResponse(userCreatedEvent.getUser(),"User saved successfully!");
    }
}
