package az.rock.waffle.ws.domain.core.entity;

import az.rock.waffle.ws.domain.entity.AggregateRoot;
import az.rock.waffle.ws.domain.valueObject.UserId;

public class User extends AggregateRoot<UserId> {
    private final String username;
    private final String firstName;
    private final String lastName;

    public User(UserId customerId, String username, String firstName, String lastName) {
        super.setId(customerId);
        this.username = username;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getUsername() {
        return username;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

}