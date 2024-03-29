package az.rock.jobber.ws.domain.core.service;

import az.rock.jobber.ws.domain.core.aggregate.UserRoot;
import az.rock.jobber.ws.domain.core.event.UserCreatedEvent;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.time.ZoneId;
import java.time.ZonedDateTime;

@Slf4j
@Service
public class UserDomainService implements AbstractUserDomainService{
    @Override
    public UserCreatedEvent validateAndInitializeUser(UserRoot userRoot) {
        log.info("Customer with id: {} is initiated", userRoot.getId().getValue());
        return new UserCreatedEvent(userRoot, ZonedDateTime.now(ZoneId.of("UTC")), userRoot.getUserType());
    }
}
