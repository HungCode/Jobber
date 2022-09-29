package az.rock.jobber.ws.domain.applicationService.exception.security;

import az.rock.jobber.ws.exception.GRuntimeException;

public class UnknownSecurityException extends GRuntimeException {
    public UnknownSecurityException() {super("Unknown Security Problem :(");}
    public UnknownSecurityException(String message) {super(message);}
    public UnknownSecurityException(String message, Throwable cause) {super(message, cause);}
}
