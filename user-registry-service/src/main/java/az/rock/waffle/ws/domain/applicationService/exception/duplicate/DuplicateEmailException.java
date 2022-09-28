package az.rock.waffle.ws.domain.applicationService.exception.duplicate;

import az.rock.waffle.ws.domain.applicationService.exception.UserDomainException;

public class DuplicateEmailException extends UserDomainException {
    public DuplicateEmailException() {super();}
    public DuplicateEmailException(String message) {super(message);}
    public DuplicateEmailException(String message, Throwable cause) {super(message, cause);}
}