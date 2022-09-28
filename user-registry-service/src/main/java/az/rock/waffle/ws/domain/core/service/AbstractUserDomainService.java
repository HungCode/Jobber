package az.rock.waffle.ws.domain.core.service;

import az.rock.waffle.ws.domain.core.aggregate.UserRoot;
import az.rock.waffle.ws.domain.core.event.UserCreatedEvent;

public interface AbstractUserDomainService {
    UserCreatedEvent validateAndInitializeUser(UserRoot userRoot);
}
