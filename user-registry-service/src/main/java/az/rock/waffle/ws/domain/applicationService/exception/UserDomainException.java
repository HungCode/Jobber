package az.rock.waffle.ws.domain.applicationService.exception;

import az.rock.waffle.ws.exception.GRuntimeException;

public class UserDomainException extends GRuntimeException {
    public UserDomainException() {super();}
    public UserDomainException(String message) {super(message);}
    public UserDomainException(String message, Throwable cause) {super(message, cause);}
}
