package az.rock.jobber.ws.messenger.response.fail;

import az.rock.jobber.ws.messenger.response.GDataTransfer;
import az.rock.jobber.ws.messenger.response.GTransfer;

/**
 * @author <a href="mailto:mammadli.vugar@hotmail.com">Vugar Mammadli</a>
 * @see GDataTransfer
 * @see GTransfer
 * @version $Id: GDataResponse.java,v 1.1 2022/12/14 15:04:24 ;
 */
public class FailGDataTransfer<T> extends GDataTransfer<T> {

    public FailGDataTransfer() {
        super();
    }

    public FailGDataTransfer(String message) {
        super(false, message, "400", null);
    }

    public FailGDataTransfer(String message, String httpStatusCode, T data) {
        super(false, message, httpStatusCode, data);
    }

    public FailGDataTransfer(String httpStatusCode, T data) {
        this("Fail", httpStatusCode, data);
    }


    public FailGDataTransfer(T data) {
        this("Fail", "500 Internal Server Error", data);
    }
}