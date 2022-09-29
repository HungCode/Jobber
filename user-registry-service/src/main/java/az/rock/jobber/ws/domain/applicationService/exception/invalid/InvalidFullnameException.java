package az.rock.jobber.ws.domain.applicationService.exception.invalid;

public class InvalidFullnameException extends InvalidFieldException{
    public InvalidFullnameException() {super();}
    public InvalidFullnameException(String message) {super(message);}
    public InvalidFullnameException(String message, Throwable cause) {super(message, cause);}
}