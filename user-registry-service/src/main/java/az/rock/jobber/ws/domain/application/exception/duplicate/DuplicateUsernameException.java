package az.rock.jobber.ws.domain.application.exception.duplicate;

import az.rock.jobber.ws.domain.application.exception.UserDomainException;

public class DuplicateUsernameException extends UserDomainException {
    public DuplicateUsernameException() {super();}
    public DuplicateUsernameException(String message) {super(message);}
    public DuplicateUsernameException(String message, Throwable cause) {super(message, cause);}
}