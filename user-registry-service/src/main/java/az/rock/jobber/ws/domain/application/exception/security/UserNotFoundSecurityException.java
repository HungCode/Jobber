package az.rock.jobber.ws.domain.application.exception.security;

import az.rock.jobber.ws.exception.GAuthenticationException;

public class UserNotFoundSecurityException extends GAuthenticationException {
    public UserNotFoundSecurityException() {super("User not found!");}
    public UserNotFoundSecurityException(String message) {super(message);}
    public UserNotFoundSecurityException(String message, Throwable cause) {super(message, cause);}
}
