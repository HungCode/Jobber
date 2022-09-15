package az.rock.waffle.ws.domain.core.service;

import az.rock.waffle.ws.domain.core.entity.User;
import az.rock.waffle.ws.domain.core.event.UserCreatedEvent;

public interface AbstractUserDomainService {
    UserCreatedEvent validateAndInitializeUser(User user);
}
