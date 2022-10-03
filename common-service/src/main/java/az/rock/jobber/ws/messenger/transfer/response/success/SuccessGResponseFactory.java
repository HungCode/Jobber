package az.rock.jobber.ws.messenger.transfer.response.success;

import az.rock.jobber.ws.messenger.transfer.GDataTransfer;
import az.rock.jobber.ws.messenger.transfer.GTransfer;
import az.rock.jobber.ws.messenger.transfer.factory.AbstractSuccessGResponseFactory;

/**
 * @author <a href="mailto:mammadli.vugar@hotmail.com">Vugar Mammadli</a>
 * @see GDataTransfer
 * @see GTransfer
 * @version $Id: GDataResponse.java,v 1.1 2022/12/14 15:04:24 ;
 */
public final class SuccessGResponseFactory<T>  extends AbstractSuccessGResponseFactory<T> {

    @Override
    public SuccessGTransfer createSuccessGResponse() {
        return new SuccessGTransfer();
    }

    @Override
    public SuccessGTransfer createSuccessGResponse(String httpStatusCode) {
        return new SuccessGTransfer(httpStatusCode);
    }

    @Override
    public SuccessGTransfer createSuccessGResponse(String message, String httpStatusCode) {
        return new SuccessGTransfer(message, httpStatusCode);
    }

    @Override
    public SuccessGDataTransfer<T> createSuccessGDataResponse(T data) {
        return new SuccessGDataTransfer<>(data);
    }

    @Override
    public SuccessGDataTransfer<T> createSuccessGDataResponse(String httpStatusCode, T data) {
        return new SuccessGDataTransfer<>(httpStatusCode, data);
    }

    @Override
    public SuccessGDataTransfer<T> createSuccessGDataResponse(String message, String httpStatusCode, T data) {
        return new SuccessGDataTransfer<>(message, httpStatusCode, data);
    }
}
