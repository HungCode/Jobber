package az.rock.jobber.ws.domain.applicationService.exception;

import feign.Response;
import feign.codec.ErrorDecoder;

public class JFeignErrorDecoder implements ErrorDecoder {
    @Override
    public Exception decode(String s, Response response) {
        return null;
    }
}
