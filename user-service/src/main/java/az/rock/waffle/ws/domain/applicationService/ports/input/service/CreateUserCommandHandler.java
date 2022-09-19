package az.rock.waffle.ws.domain.applicationService.ports.input.service;

import az.rock.waffle.ws.domain.applicationService.create.CreateUserCommand;
import az.rock.waffle.ws.domain.applicationService.mapper.UserDataMapper;
import az.rock.waffle.ws.domain.applicationService.ports.output.repository.AbstractUserRepository;
import az.rock.waffle.ws.domain.core.entity.User;
import az.rock.waffle.ws.domain.core.event.UserCreatedEvent;
import az.rock.waffle.ws.domain.applicationService.exception.UserDomainException;
import az.rock.waffle.ws.domain.core.service.UserDomainService;
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
        User user = this.userDataMapper.createUserCommandToUser(createUserCommand);
        UserCreatedEvent userCreatedEvent = this.userDomainService.validateAndInitializeUser(user);
        User savedUser = this.userRepository.createUser(user);
        if (Objects.isNull(savedUser)){
            log.error("Could not save user with id: {}",createUserCommand.getCustomerId());
            throw new UserDomainException("Could not save user with id: {}" + createUserCommand.getCustomerId());
        }
        log.info("Returning CustomerCreatedEvent for customer id: {}", createUserCommand.getCustomerId());
        return userCreatedEvent;
    }

}
