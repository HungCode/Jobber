package az.rock.jobber.ws.domain.application.exception.feign;

import feign.FeignException;
import feign.Request;

import java.util.Collection;
import java.util.Map;

public class JFeignException extends FeignException {

    protected JFeignException(int status, String message, Throwable cause) {
        super(status, message, cause);
    }

    protected JFeignException(int status, String message, Throwable cause, byte[] responseBody, Map<String, Collection<String>> responseHeaders) {
        super(status, message, cause, responseBody, responseHeaders);
    }

    protected JFeignException(int status, String message) {
        super(status, message);
    }

    protected JFeignException(int status, String message, byte[] responseBody, Map<String, Collection<String>> responseHeaders) {
        super(status, message, responseBody, responseHeaders);
    }

    protected JFeignException(int status, String message, Request request, Throwable cause) {
        super(status, message, request, cause);
    }

    protected JFeignException(int status, String message, Request request, Throwable cause, byte[] responseBody, Map<String, Collection<String>> responseHeaders) {
        super(status, message, request, cause, responseBody, responseHeaders);
    }

    protected JFeignException(int status, String message, Request request) {
        super(status, message, request);
    }

    protected JFeignException(int status, String message, Request request, byte[] responseBody, Map<String, Collection<String>> responseHeaders) {
        super(status, message, request, responseBody, responseHeaders);
    }
}
