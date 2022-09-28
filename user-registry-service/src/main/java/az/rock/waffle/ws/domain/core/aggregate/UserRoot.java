package az.rock.waffle.ws.domain.core.aggregate;

import az.rock.waffle.ws.dataAccess.aop.anno.JUniqueEmail;
import az.rock.waffle.ws.dataAccess.aop.anno.JUniqueUserName;
import az.rock.waffle.ws.domain.entity.AggregateRoot;
import az.rock.waffle.ws.domain.valueObject.UserId;
import az.rock.waffle.ws.valueObject.UserType;

import java.util.Locale;
import java.util.UUID;

public class UserRoot extends AggregateRoot<UserId> {

    private final UUID finIdentify;
    private final String username;
    private final String firstName;
    private final String lastName;
    private final String password;
    private final String email;
    private final UserType userType;

    public UserRoot(UserId customerId, String username, String firstName, String lastName, String password, String email,UserType userType) {
        super.setId(customerId);
        this.finIdentify = UUID.randomUUID();
        this.username = username;
        this.firstName = this.capitalize(firstName);
        this.lastName = this.capitalize(lastName);
        this.password= password;
        this.email = email;
        this.userType = userType;
    }


    public UUID getFinIdentify() {
        return finIdentify;
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

    public UserType getUserType() {
        return userType;
    }

    private String capitalize(String fieldName){
        return fieldName.substring(0,1).toUpperCase(Locale.ROOT).concat(fieldName.substring(1).toLowerCase(Locale.ROOT));
    }


}