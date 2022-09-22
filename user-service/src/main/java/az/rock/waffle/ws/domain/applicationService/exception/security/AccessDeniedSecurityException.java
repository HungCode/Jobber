package az.rock.waffle.ws.domain.applicationService.exception.security;

import az.rock.waffle.ws.exception.GRuntimeException;

public class AccessDeniedSecurityException extends GRuntimeException {
    public AccessDeniedSecurityException() {super("Access denied :(");}
    public AccessDeniedSecurityException(String message) {super(message);}
    public AccessDeniedSecurityException(String message, Throwable cause) {super(message, cause);}
}
