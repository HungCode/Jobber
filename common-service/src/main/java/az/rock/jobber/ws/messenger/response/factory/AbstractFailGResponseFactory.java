package az.rock.jobber.ws.messenger.response.factory;

import az.rock.jobber.ws.messenger.response.GDataResponse;
import az.rock.jobber.ws.messenger.response.GResponse;
import az.rock.jobber.ws.messenger.response.fail.FailGDataResponse;
import az.rock.jobber.ws.messenger.response.fail.FailGResponse;

/**
 * @author <a href="mailto:mammadli.vugar@hotmail.com">Vugar Mammadli</a>
 * @see GDataResponse
 * @see GResponse
 * @version $Id: GDataResponse.java,v 1.1 2022/12/14 15:04:24 ;
 */
public abstract class AbstractFailGResponseFactory<T> {
    public abstract FailGResponse createFailGResponse();
    public abstract FailGResponse createFailGResponse(String httpStatusCode);
    public abstract FailGResponse createFailGResponse(String message, String httpStatusCode);

    public abstract FailGDataResponse<T> createFailGDataResponse(T data);
    public abstract FailGDataResponse<T> createFailGDataResponse(String httpStatusCode, T data);
    public abstract FailGDataResponse<T> createFailGDataResponse(String message, String httpStatusCode, T data);
}
