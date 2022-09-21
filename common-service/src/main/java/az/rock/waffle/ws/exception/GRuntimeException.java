package az.rock.waffle.ws.exception;

public class GRuntimeException extends RuntimeException {
    public GRuntimeException() {super();}
    public GRuntimeException(String message) {super(message);}
    public GRuntimeException(String message, Throwable cause) {super(message, cause);}
}