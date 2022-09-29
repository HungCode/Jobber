package az.rock.jobber.ws.response.success;

import az.rock.jobber.ws.response.GDataResponse;
import az.rock.jobber.ws.response.GResponse;
import az.rock.jobber.ws.response.factory.AbstractSuccessGResponseFactory;

/**
 * @author <a href="mailto:mammadli.vugar@hotmail.com">Vugar Mammadli</a>
 * @see GDataResponse
 * @see GResponse
 * @version $Id: GDataResponse.java,v 1.1 2022/12/14 15:04:24 ;
 */
public final class SuccessGResponseFactory<T>  extends AbstractSuccessGResponseFactory<T> {

    @Override
    public SuccessGResponse createSuccessGResponse() {
        return new SuccessGResponse();
    }

    @Override
    public SuccessGResponse createSuccessGResponse(String httpStatusCode) {
        return new SuccessGResponse(httpStatusCode);
    }

    @Override
    public SuccessGResponse createSuccessGResponse(String message, String httpStatusCode) {
        return new SuccessGResponse(message, httpStatusCode);
    }

    @Override
    public SuccessGDataResponse<T> createSuccessGDataResponse(T data) {
        return new SuccessGDataResponse<>(data);
    }

    @Override
    public SuccessGDataResponse<T> createSuccessGDataResponse(String httpStatusCode, T data) {
        return new SuccessGDataResponse<>(httpStatusCode, data);
    }

    @Override
    public SuccessGDataResponse<T> createSuccessGDataResponse(String message, String httpStatusCode, T data) {
        return new SuccessGDataResponse<>(message, httpStatusCode, data);
    }
}
