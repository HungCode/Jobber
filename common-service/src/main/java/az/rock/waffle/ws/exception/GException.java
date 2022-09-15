package az.rock.waffle.ws.exception;

public abstract class GException extends Exception {
    public GException() {super("Unknown Exception ");}
    public GException(String message) {super(message);}
    public GException(String message, Throwable cause) {super(message, cause);}
}
