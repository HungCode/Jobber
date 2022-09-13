package az.rock.waffle.ws.response.factory;

import az.rock.waffle.ws.response.success.SuccessGDataResponse;
import az.rock.waffle.ws.response.success.SuccessGResponse;
/**
 * @author <a href="mailto:mammadli.vugar@hotmail.com">Vugar Mammadli</a>
 * @see az.rock.waffle.ws.response.GDataResponse
 * @see az.rock.waffle.ws.response.GResponse
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
