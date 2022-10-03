package az.rock.jobber.ws.messenger.response.factory;

import az.rock.jobber.ws.messenger.response.GDataTransfer;
import az.rock.jobber.ws.messenger.response.GTransfer;
import az.rock.jobber.ws.messenger.response.success.SuccessGDataTransfer;
import az.rock.jobber.ws.messenger.response.success.SuccessGTransfer;

/**
 * @author <a href="mailto:mammadli.vugar@hotmail.com">Vugar Mammadli</a>
 * @see GDataTransfer
 * @see GTransfer
 * @version $Id: GDataResponse.java,v 1.1 2022/12/14 15:04:24 ;
 */
public abstract class AbstractSuccessGResponseFactory<T> {
    public abstract SuccessGTransfer createSuccessGResponse();
    public abstract SuccessGTransfer createSuccessGResponse(String httpStatusCode);
    public abstract SuccessGTransfer createSuccessGResponse(String message, String httpStatusCode);

    public abstract SuccessGDataTransfer<T> createSuccessGDataResponse(T data);
    public abstract SuccessGDataTransfer<T> createSuccessGDataResponse(String httpStatusCode, T data);
    public abstract SuccessGDataTransfer<T> createSuccessGDataResponse(String message, String httpStatusCode, T data);
}
