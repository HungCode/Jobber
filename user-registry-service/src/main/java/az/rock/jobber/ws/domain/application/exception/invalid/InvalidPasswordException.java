package az.rock.jobber.ws.domain.application.exception.invalid;

public class InvalidPasswordException extends InvalidFieldException{
    public InvalidPasswordException() {super();}
    public InvalidPasswordException(String message) {super(message);}
    public InvalidPasswordException(String message, Throwable cause) {super(message, cause);}
}