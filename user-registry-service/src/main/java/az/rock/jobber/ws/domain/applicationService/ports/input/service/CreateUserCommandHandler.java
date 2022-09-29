package az.rock.jobber.ws.domain.applicationService.ports.input.service;

import az.rock.jobber.ws.domain.applicationService.ports.output.repository.AbstractUserRepository;
import az.rock.jobber.ws.domain.applicationService.dto.create.CreateUserCommand;
import az.rock.jobber.ws.domain.applicationService.mapper.UserDataMapper;
import az.rock.jobber.ws.domain.core.aggregate.UserRoot;
import az.rock.jobber.ws.domain.core.event.UserCreatedEvent;
import az.rock.jobber.ws.domain.applicationService.exception.UserDomainException;
import az.rock.jobber.ws.domain.core.service.UserDomainService;
import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.Objects;

@Slf4j
@Component
@RequiredArgsConstructor
public class CreateUserCommandHandler {
    private final UserDomainService userDomainService;
    private final AbstractUserRepository userRepository;
    private final UserDataMapper userDataMapper;


    @SneakyThrows(UserDomainException.class)
    @Transactional
    public UserCreatedEvent createdEvent(CreateUserCommand createUserCommand){
        UserRoot userRoot = this.userDataMapper.createUserCommandToUser(createUserCommand);
        UserCreatedEvent userCreatedEvent = this.userDomainService.validateAndInitializeUser(userRoot);
        UserRoot savedUserRoot = this.userRepository.createUser(userRoot);
        if (Objects.isNull(savedUserRoot)){
            log.error("Could not save user with id: {}",createUserCommand.getCustomerId());
            throw new UserDomainException("Could not save user with id: {}" + createUserCommand.getCustomerId());
        }
        log.info("Returning CustomerCreatedEvent for customer id: {}", createUserCommand.getCustomerId());
        return userCreatedEvent;
    }

}
