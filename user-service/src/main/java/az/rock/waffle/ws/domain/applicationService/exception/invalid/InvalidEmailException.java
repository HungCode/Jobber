package az.rock.waffle.ws.domain.applicationService.exception.invalid;

import az.rock.waffle.ws.domain.applicationService.exception.UserDomainException;

public class InvalidEmailException extends UserDomainException {
    public InvalidEmailException() {super();}
    public InvalidEmailException(String message) {super(message);}
    public InvalidEmailException(String message, Throwable cause) {super(message, cause);}
}