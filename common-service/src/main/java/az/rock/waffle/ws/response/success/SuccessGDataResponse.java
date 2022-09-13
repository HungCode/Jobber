package az.rock.waffle.ws.response.success;

import az.rock.waffle.ws.response.GDataResponse;
/**
 * @author <a href="mailto:mammadli.vugar@hotmail.com">Vugar Mammadli</a>
 * @see az.rock.waffle.ws.response.GDataResponse
 * @see az.rock.waffle.ws.response.GResponse
 * @version $Id: GDataResponse.java,v 1.1 2022/12/14 15:04:24 ;
 */
public class SuccessGDataResponse<T> extends GDataResponse<T> {

    public SuccessGDataResponse( String message, String httpStatusCode, T data) {
        super(true, message, httpStatusCode, data);
    }

    public SuccessGDataResponse( String httpStatusCode, T data) {
        this("Successful", httpStatusCode, data);
    }

    public SuccessGDataResponse( T data) {
        this("Successful", "200 OK", data);
    }
}
