package az.rock.jobber.ws.domain.application.exception.feign;

import az.rock.jobber.ws.exception.GRuntimeException;
import feign.Response;
import feign.codec.ErrorDecoder;

public class JFeignErrorDecoder implements ErrorDecoder {
    @Override
    public Exception decode(String s, Response response) {
        return new GRuntimeException();
    }
}
