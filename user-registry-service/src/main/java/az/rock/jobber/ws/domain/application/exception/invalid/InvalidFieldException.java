package az.rock.jobber.ws.domain.application.exception.invalid;

import az.rock.jobber.ws.domain.application.exception.UserDomainException;

public class InvalidFieldException extends UserDomainException {
    public InvalidFieldException() {super();}
    public InvalidFieldException(String message) {super(message);}
    public InvalidFieldException(String message, Throwable cause) {super(message, cause);}
}