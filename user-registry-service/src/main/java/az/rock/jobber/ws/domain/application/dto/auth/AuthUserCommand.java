package az.rock.jobber.ws.domain.application.dto.auth;

import az.rock.jobber.ws.domain.application.dto.Command;

public record AuthUserCommand(
        String username,
        String password
) implements Command {
    public AuthUserCommand(String username,String password){
        this.username = username;
        this.password = password;
    }

    @Override
    public String toString() {
        return this.username;
    }
}