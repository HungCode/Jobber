package az.rock.jobber.ws.response.fail;

import az.rock.jobber.ws.response.GDataResponse;
import az.rock.jobber.ws.response.GResponse;
import az.rock.jobber.ws.response.factory.AbstractFailGResponseFactory;
/**
 * @author <a href="mailto:mammadli.vugar@hotmail.com">Vugar Mammadli</a>
 * @see GDataResponse
 * @see GResponse
 * @version $Id: GDataResponse.java,v 1.1 2022/12/14 15:04:24 ;
 */
public final class FailGResponseFactory<T> extends AbstractFailGResponseFactory<T> {

    @Override
    public FailGResponse createFailGResponse() {
        return new FailGResponse();
    }

    @Override
    public FailGResponse createFailGResponse(String httpStatusCode) {
        return new FailGResponse(httpStatusCode);
    }

    @Override
    public FailGResponse createFailGResponse(String message, String httpStatusCode) {
        return new FailGResponse(message, httpStatusCode);
    }

    @Override
    public FailGDataResponse<T> createFailGDataResponse(T data) {
        return new FailGDataResponse<>(data);
    }

    @Override
    public FailGDataResponse<T> createFailGDataResponse(String httpStatusCode, T data) {
        return new FailGDataResponse<>(httpStatusCode, data);
    }

    @Override
    public FailGDataResponse<T> createFailGDataResponse(String message, String httpStatusCode, T data) {
        return new FailGDataResponse<>(message, httpStatusCode, data);
    }
}
