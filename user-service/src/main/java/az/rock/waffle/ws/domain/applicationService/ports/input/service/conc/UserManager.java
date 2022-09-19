package az.rock.waffle.ws.domain.applicationService.ports.input.service.conc;

import az.rock.waffle.ws.domain.applicationService.create.CreateUserCommand;
import az.rock.waffle.ws.domain.applicationService.create.CreateUserResponse;
import az.rock.waffle.ws.domain.applicationService.mapper.UserDataMapper;
import az.rock.waffle.ws.domain.applicationService.ports.input.service.CreateUserCommandHandler;
import az.rock.waffle.ws.domain.applicationService.ports.input.service.abst.UserService;
import az.rock.waffle.ws.domain.applicationService.ports.output.publisher.UserMessagePublisher;
import az.rock.waffle.ws.domain.core.event.UserCreatedEvent;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

@Slf4j
@Validated
@Service
@RequiredArgsConstructor
public class UserManager implements UserService {
    private final CreateUserCommandHandler userCommandHandler;
    private final UserDataMapper userDataMapper;
    private final UserMessagePublisher userMessagePublisher;

    @Override
    public CreateUserResponse createUser(CreateUserCommand userCommand) {
        UserCreatedEvent userCreatedEvent = this.userCommandHandler.createdEvent(userCommand);
        userMessagePublisher.publish(userCreatedEvent);
        return this.userDataMapper.userToCreateUserResponse(userCreatedEvent.getUser(),"User saved successfully!");
    }
}
