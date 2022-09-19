package az.rock.waffle.ws.domain.applicationService.create;

import lombok.Builder;
import lombok.Getter;

import javax.validation.constraints.NotNull;
import java.util.UUID;

@Getter
@Builder
public class CreateUserCommand  {
    @NotNull
    private final UUID customerId;
    @NotNull
    private final String username;
    @NotNull
    private final String firstName;
    @NotNull
    private final String lastName;
    @NotNull
    private final String password;
    @NotNull
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