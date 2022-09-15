package az.rock.waffle.ws.domain.core.service;

import az.rock.waffle.ws.domain.core.entity.User;
import az.rock.waffle.ws.domain.core.event.UserCreatedEvent;
import lombok.extern.slf4j.Slf4j;

import java.time.ZoneId;
import java.time.ZonedDateTime;

@Slf4j
public class UserDomainService implements AbstractUserDomainService{
    @Override
    public UserCreatedEvent validateAndInitializeUser(User user) {
        //Any Business logic required to run for a customer creation
        log.info("Customer with id: {} is initiated", user.getId().getValue());
        return new UserCreatedEvent(user, ZonedDateTime.now(ZoneId.of("UTC")));
    }
}
