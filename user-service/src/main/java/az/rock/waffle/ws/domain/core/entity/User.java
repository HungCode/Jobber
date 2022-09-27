package az.rock.waffle.ws.domain.core.entity;

import az.rock.waffle.ws.dataAccess.aop.anno.JUniqueEmail;
import az.rock.waffle.ws.dataAccess.aop.anno.JUniqueUserName;
import az.rock.waffle.ws.domain.entity.AggregateRoot;
import az.rock.waffle.ws.domain.valueObject.UserId;

import java.util.Locale;

public class User extends AggregateRoot<UserId> {
    @JUniqueUserName
    private final String username;
    private final String firstName;
    private final String lastName;
    private final String password;
    @JUniqueEmail
    private final String email;

    public User(UserId customerId, String username, String firstName, String lastName,String password,String email) {
        super.setId(customerId);
        this.username = username;
        this.firstName = this.capitalize(firstName);
        this.lastName = this.capitalize(firstName);
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

    private String capitalize(String fieldName){
        return fieldName.substring(0,1).toUpperCase(Locale.ROOT).concat(fieldName.substring(1).toLowerCase(Locale.ROOT));
    }
}