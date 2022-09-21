package az.rock.waffle.ws.domain.applicationService.exception.security;

import az.rock.waffle.ws.exception.GRuntimeException;

public class UnknownSecurityException extends GRuntimeException {
    public UnknownSecurityException() {super();}
    public UnknownSecurityException(String message) {super(message);}
    public UnknownSecurityException(String message, Throwable cause) {super(message, cause);}
}
