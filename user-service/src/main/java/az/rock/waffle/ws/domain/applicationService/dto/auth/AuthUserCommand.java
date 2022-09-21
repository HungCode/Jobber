package az.rock.waffle.ws.domain.applicationService.dto.auth;

import az.rock.waffle.ws.domain.applicationService.dto.Command;
public record AuthUserCommand(
        String username,
        String password
) implements Command {
    public AuthUserCommand(String username,String password){
        this.username = username;
        this.password = password;
    }
}
