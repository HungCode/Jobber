package az.rock.jobber.ws.domain.application.exception.security;

import az.rock.jobber.ws.exception.GRuntimeException;

public class AccessDeniedSecurityException extends GRuntimeException {
    public AccessDeniedSecurityException() {super("Access denied :(");}
    public AccessDeniedSecurityException(String message) {super(message);}
    public AccessDeniedSecurityException(String message, Throwable cause) {super(message, cause);}
}
