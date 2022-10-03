package az.rock.jobber.ws.messenger.response.fail;

import az.rock.jobber.ws.messenger.response.GDataTransfer;
import az.rock.jobber.ws.messenger.response.GTransfer;
import az.rock.jobber.ws.messenger.response.factory.AbstractFailGResponseFactory;
/**
 * @author <a href="mailto:mammadli.vugar@hotmail.com">Vugar Mammadli</a>
 * @see GDataTransfer
 * @see GTransfer
 * @version $Id: GDataResponse.java,v 1.1 2022/12/14 15:04:24 ;
 */
public final class FailGResponseFactory<T> extends AbstractFailGResponseFactory<T> {

    @Override
    public FailGTransfer createFailGResponse() {
        return new FailGTransfer();
    }

    @Override
    public FailGTransfer createFailGResponse(String httpStatusCode) {
        return new FailGTransfer(httpStatusCode);
    }

    @Override
    public FailGTransfer createFailGResponse(String message, String httpStatusCode) {
        return new FailGTransfer(message, httpStatusCode);
    }

    @Override
    public FailGDataTransfer<T> createFailGDataResponse(T data) {
        return new FailGDataTransfer<>(data);
    }

    @Override
    public FailGDataTransfer<T> createFailGDataResponse(String httpStatusCode, T data) {
        return new FailGDataTransfer<>(httpStatusCode, data);
    }

    @Override
    public FailGDataTransfer<T> createFailGDataResponse(String message, String httpStatusCode, T data) {
        return new FailGDataTransfer<>(message, httpStatusCode, data);
    }
}
