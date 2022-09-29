package az.rock.jobber.ws.exception;


public class GAuthenticationException extends GRuntimeException {
    public GAuthenticationException(String msg, Throwable cause) {
        super(msg, cause);
    }

    public GAuthenticationException(String msg) {
        super(msg);
    }

    public GAuthenticationException() {
        super("JWT string has a digest/signature, but the header does not reference a valid signature algorithm.");
    }
}
