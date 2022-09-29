package az.rock.jobber.ws.domain.applicationService.exception.invalid;

public class InvalidUsernameException extends InvalidFieldException{
    public InvalidUsernameException() {super();}
    public InvalidUsernameException(String message) {super(message);}
    public InvalidUsernameException(String message, Throwable cause) {super(message, cause);}
}
