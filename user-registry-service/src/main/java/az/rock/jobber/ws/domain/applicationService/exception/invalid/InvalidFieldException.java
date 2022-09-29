package az.rock.jobber.ws.domain.applicationService.exception.invalid;

import az.rock.jobber.ws.domain.applicationService.exception.UserDomainException;

public class InvalidFieldException extends UserDomainException {
    public InvalidFieldException() {super();}
    public InvalidFieldException(String message) {super(message);}
    public InvalidFieldException(String message, Throwable cause) {super(message, cause);}
}