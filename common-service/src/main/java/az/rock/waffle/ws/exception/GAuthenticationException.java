package az.rock.waffle.ws.exception;

import org.springframework.security.core.AuthenticationException;

public class GAuthenticationException extends AuthenticationException {
    public GAuthenticationException(String msg, Throwable cause) {
        super(msg, cause);
    }

    public GAuthenticationException(String msg) {
        super(msg);
    }
}
