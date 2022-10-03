package az.rock.jobber.ws.messenger.response.fail;

import az.rock.jobber.ws.messenger.response.GTransfer;

public final class FailGTransfer extends GTransfer {
    public FailGTransfer() {
        super(false);
    }

    public FailGTransfer(String message, String httpStatusCode) {
        super(false, message, httpStatusCode);
    }

    public FailGTransfer(String httpStatusCode) {
        this("Fail", httpStatusCode);
    }



}