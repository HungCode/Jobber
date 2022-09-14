package az.rock.waffle.ws.response.fail;

import az.rock.waffle.ws.response.GDataResponse;

/**
 * @author <a href="mailto:mammadli.vugar@hotmail.com">Vugar Mammadli</a>
 * @see az.rock.waffle.ws.response.GDataResponse
 * @see az.rock.waffle.ws.response.GResponse
 * @version $Id: GDataResponse.java,v 1.1 2022/12/14 15:04:24 ;
 */
public class FailGDataResponse<T> extends GDataResponse<T> {

    public FailGDataResponse( String message, String httpStatusCode, T data) {
        super(false, message, httpStatusCode, data);
    }

    public FailGDataResponse( String httpStatusCode, T data) {
        this("Fail", httpStatusCode, data);
    }

    public FailGDataResponse( T data) {
        this("Fail", "500 Internal Server Error", data);
    }
}