package az.rock.jobber.ws.domain.application.exception;

import az.rock.jobber.ws.exception.GRuntimeException;

public class UserDomainException extends GRuntimeException {
    public UserDomainException() {super();}
    public UserDomainException(String message) {super(message);}
    public UserDomainException(String message, Throwable cause) {super(message, cause);}
}
