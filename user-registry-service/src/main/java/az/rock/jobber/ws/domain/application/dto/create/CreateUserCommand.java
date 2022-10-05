package az.rock.jobber.ws.domain.application.dto.create;

import az.rock.jobber.ws.domain.application.validator.anno.*;
import az.rock.jobber.ws.domain.application.dto.Command;
import az.rock.jobber.ws.valueObject.UserType;
import lombok.Builder;
import lombok.Getter;

import java.util.UUID;

@Getter
@Builder
public class CreateUserCommand  implements Command {

    private final UUID userUUID;
    @GUsername
    private final String username;
    @GFullName
    private final String firstName;
    @GFullName
    private final String lastName;
    @GPassword
    private final String password;
    @GEmail
    private final String email;
    @GUserType
    private final UserType userType;


    public CreateUserCommand(UUID userUUID, String username, String firstName, String lastName, String password, String email, UserType userType) {
        this.userUUID = UUID.randomUUID();
        this.username = username;
        this.firstName = firstName;
        this.lastName = lastName;
        this.password = password;
        this.email = email;
        this.userType = userType;
    }


}