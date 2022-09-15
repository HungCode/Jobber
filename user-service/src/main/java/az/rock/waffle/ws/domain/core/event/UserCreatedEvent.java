package az.rock.waffle.ws.domain.core.event;

import az.rock.waffle.ws.domain.core.entity.User;
import az.rock.waffle.ws.domain.event.DomainEvent;

import java.time.ZonedDateTime;

public class UserCreatedEvent implements DomainEvent<User> {
    private final User user;

    private final ZonedDateTime createdAt;

    public UserCreatedEvent(User user, ZonedDateTime createdAt) {
        this.user = user;
        this.createdAt = createdAt;
    }

    public User getCustomer() {
        return this.user;
    }
}
