package az.rock.jobber.ws.response.factory;

import az.rock.jobber.ws.response.GDataResponse;
import az.rock.jobber.ws.response.GResponse;
import az.rock.jobber.ws.response.success.SuccessGDataResponse;
import az.rock.jobber.ws.response.success.SuccessGResponse;

/**
 * @author <a href="mailto:mammadli.vugar@hotmail.com">Vugar Mammadli</a>
 * @see GDataResponse
 * @see GResponse
 * @version $Id: GDataResponse.java,v 1.1 2022/12/14 15:04:24 ;
 */
public abstract class AbstractSuccessGResponseFactory<T> {
    public abstract SuccessGResponse createSuccessGResponse();
    public abstract SuccessGResponse createSuccessGResponse(String httpStatusCode);
    public abstract SuccessGResponse createSuccessGResponse(String message, String httpStatusCode);

    public abstract SuccessGDataResponse<T> createSuccessGDataResponse(T data);
    public abstract SuccessGDataResponse<T> createSuccessGDataResponse(String httpStatusCode, T data);
    public abstract SuccessGDataResponse<T> createSuccessGDataResponse(String message, String httpStatusCode, T data);
}
