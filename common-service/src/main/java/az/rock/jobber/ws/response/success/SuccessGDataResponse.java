package az.rock.jobber.ws.response.success;

import az.rock.jobber.ws.response.GDataResponse;
import az.rock.jobber.ws.response.GResponse;

/**
 * @author <a href="mailto:mammadli.vugar@hotmail.com">Vugar Mammadli</a>
 * @see GDataResponse
 * @see GResponse
 * @version $Id: GDataResponse.java,v 1.1 2022/12/14 15:04:24 ;
 */
public class SuccessGDataResponse<T> extends GDataResponse<T> {
    public SuccessGDataResponse(){super();}

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
