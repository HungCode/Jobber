package az.rock.jobber.ws.domain.core.service;

import az.rock.jobber.ws.domain.core.aggregate.UserRoot;
import az.rock.jobber.ws.domain.core.event.UserCreatedEvent;

public interface AbstractUserDomainService {
    UserCreatedEvent validateAndInitializeUser(UserRoot userRoot);
}
