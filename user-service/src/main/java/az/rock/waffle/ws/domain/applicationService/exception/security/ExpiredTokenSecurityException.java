package az.rock.waffle.ws.domain.applicationService.exception.security;

import az.rock.waffle.ws.exception.GRuntimeException;

public class ExpiredTokenSecurityException extends GRuntimeException {
    public ExpiredTokenSecurityException() {super();}
    public ExpiredTokenSecurityException(String message) {super(message);}
    public ExpiredTokenSecurityException(String message, Throwable cause) {super(message, cause);}
}
