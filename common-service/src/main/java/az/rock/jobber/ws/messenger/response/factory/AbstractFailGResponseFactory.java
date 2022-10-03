package az.rock.jobber.ws.messenger.response.factory;

import az.rock.jobber.ws.messenger.response.GDataTransfer;
import az.rock.jobber.ws.messenger.response.GTransfer;
import az.rock.jobber.ws.messenger.response.fail.FailGDataTransfer;
import az.rock.jobber.ws.messenger.response.fail.FailGTransfer;

/**
 * @author <a href="mailto:mammadli.vugar@hotmail.com">Vugar Mammadli</a>
 * @see GDataTransfer
 * @see GTransfer
 * @version $Id: GDataResponse.java,v 1.1 2022/12/14 15:04:24 ;
 */
public abstract class AbstractFailGResponseFactory<T> {
    public abstract FailGTransfer createFailGResponse();
    public abstract FailGTransfer createFailGResponse(String httpStatusCode);
    public abstract FailGTransfer createFailGResponse(String message, String httpStatusCode);

    public abstract FailGDataTransfer<T> createFailGDataResponse(T data);
    public abstract FailGDataTransfer<T> createFailGDataResponse(String httpStatusCode, T data);
    public abstract FailGDataTransfer<T> createFailGDataResponse(String message, String httpStatusCode, T data);
}
