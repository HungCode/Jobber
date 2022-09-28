package az.rock.waffle.ws.domain.applicationService.dto.create;

import az.rock.waffle.ws.domain.applicationService.dto.Command;
import az.rock.waffle.ws.domain.applicationService.validator.anno.GEmail;
import az.rock.waffle.ws.domain.applicationService.validator.anno.GFullName;
import az.rock.waffle.ws.domain.applicationService.validator.anno.GPassword;
import az.rock.waffle.ws.domain.applicationService.validator.anno.GUsername;
import lombok.Builder;
import lombok.Getter;

import javax.validation.constraints.NotNull;
import java.util.Locale;
import java.util.UUID;

@Getter
@Builder
public class CreateUserCommand  implements Command {

    private final UUID customerId;
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


    public CreateUserCommand(UUID customerId, String username, String firstName, String lastName, String password, String email) {
        this.customerId = UUID.randomUUID();
        this.username = username;
        this.firstName = firstName;
        this.lastName = lastName;
        this.password = password;
        this.email = email;
    }


}