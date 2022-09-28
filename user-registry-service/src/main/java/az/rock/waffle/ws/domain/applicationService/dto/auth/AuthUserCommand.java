package az.rock.waffle.ws.domain.applicationService.dto.auth;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class AuthUserCommand {
    private final String username;
    private final String password;
}
