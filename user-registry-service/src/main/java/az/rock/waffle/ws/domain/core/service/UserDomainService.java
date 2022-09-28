package az.rock.waffle.ws.domain.core.service;

import az.rock.waffle.ws.domain.core.aggregate.UserRoot;
import az.rock.waffle.ws.domain.core.event.UserCreatedEvent;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.time.ZoneId;
import java.time.ZonedDateTime;

@Slf4j
@Service
public class UserDomainService implements AbstractUserDomainService{
    @Override
    public UserCreatedEvent validateAndInitializeUser(UserRoot userRoot) {
        //Any Business logic required to run for a customer creation
        log.info("Customer with id: {} is initiated", userRoot.getId().getValue());
        return new UserCreatedEvent(userRoot, ZonedDateTime.now(ZoneId.of("UTC")));
    }
}
