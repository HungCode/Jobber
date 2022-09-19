package az.rock.waffle.ws.domain.core.entity;

import az.rock.waffle.ws.domain.entity.AggregateRoot;
import az.rock.waffle.ws.domain.valueObject.UserId;

import javax.validation.constraints.NotNull;

public class User extends AggregateRoot<UserId> {
    private final String username;
    private final String firstName;
    private final String lastName;
    private final String password;
    private final String email;

    public User(UserId customerId, String username, String firstName, String lastName,String password,String email) {
        super.setId(customerId);
        this.username = username;
        this.firstName = firstName;
        this.lastName = lastName;
        this.password= password;
        this.email = email;
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

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }
}