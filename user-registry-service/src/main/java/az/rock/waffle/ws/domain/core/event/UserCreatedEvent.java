package az.rock.waffle.ws.domain.core.event;

import az.rock.waffle.ws.domain.core.aggregate.UserRoot;
import az.rock.waffle.ws.domain.event.DomainEvent;

import java.time.ZonedDateTime;

public class UserCreatedEvent implements DomainEvent<UserRoot> {
    private final UserRoot userRoot;

    private final ZonedDateTime createdAt;

    public UserCreatedEvent(UserRoot userRoot, ZonedDateTime createdAt) {
        this.userRoot = userRoot;
        this.createdAt = createdAt;
    }

    public UserRoot getUser() {
        return this.userRoot;
    }
}
