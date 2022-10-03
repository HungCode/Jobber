package az.rock.jobber.ws.messenger.transfer.response.success;

import az.rock.jobber.ws.messenger.transfer.GDataTransfer;
import az.rock.jobber.ws.messenger.transfer.GTransfer;
import az.rock.jobber.ws.messenger.transfer.response.GResponseDataTransfer;

/**
 * @author <a href="mailto:mammadli.vugar@hotmail.com">Vugar Mammadli</a>
 * @see GDataTransfer
 * @see GTransfer
 * @version $Id: GDataResponse.java,v 1.1 2022/12/14 15:04:24 ;
 */
public class SuccessGDataTransfer<T> extends GResponseDataTransfer<T> {
    public SuccessGDataTransfer(){super();}

    public SuccessGDataTransfer(T data) {
        this("Successful", "200 OK", data);
    }

    public SuccessGDataTransfer(String message, T data) {
        this(message, "200 OK", data);
    }

    public SuccessGDataTransfer(String message, String httpStatusCode, T data) {
        super(true, message, httpStatusCode, data);
    }
}
