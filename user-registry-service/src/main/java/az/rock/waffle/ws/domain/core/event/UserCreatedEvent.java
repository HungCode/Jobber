package az.rock.waffle.ws.domain.core.event;

import az.rock.waffle.ws.domain.core.aggregate.UserRoot;
import az.rock.waffle.ws.domain.event.DomainEvent;
import az.rock.waffle.ws.valueObject.UserType;

import java.time.ZonedDateTime;

public class UserCreatedEvent implements DomainEvent<UserRoot> {
    private final UserRoot userRoot;

    private final ZonedDateTime createdAt;

    private final UserType userType;

    public UserCreatedEvent(UserRoot userRoot, ZonedDateTime createdAt, UserType userType) {
        this.userRoot = userRoot;
        this.createdAt = createdAt;
        this.userType = userType;
    }

    public UserRoot getUser() {
        return this.userRoot;
    }
}
