package az.rock.jobber.ws.domain.application.exception.invalid;

import az.rock.jobber.ws.domain.application.exception.UserDomainException;

public class InvalidEmailException extends UserDomainException {
    public InvalidEmailException() {super();}
    public InvalidEmailException(String message) {super(message);}
    public InvalidEmailException(String message, Throwable cause) {super(message, cause);}
}