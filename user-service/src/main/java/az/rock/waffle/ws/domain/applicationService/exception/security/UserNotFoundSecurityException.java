package az.rock.waffle.ws.domain.applicationService.exception.security;

import az.rock.waffle.ws.exception.GAuthenticationException;
import az.rock.waffle.ws.exception.GRuntimeException;

public class UserNotFoundSecurityException extends GAuthenticationException {
    public UserNotFoundSecurityException() {super("User not found!");}
    public UserNotFoundSecurityException(String message) {super(message);}
    public UserNotFoundSecurityException(String message, Throwable cause) {super(message, cause);}
}
