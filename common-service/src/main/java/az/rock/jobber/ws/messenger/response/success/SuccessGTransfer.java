package az.rock.jobber.ws.messenger.response.success;

import az.rock.jobber.ws.messenger.response.GTransfer;

public final class SuccessGTransfer extends GTransfer {
    public SuccessGTransfer() {
        super(true);
    }

    public SuccessGTransfer(String message, String httpStatusCode) {
        super(true, message, httpStatusCode);
    }
    public SuccessGTransfer(String httpStatusCode) {
        this("Successful", httpStatusCode);
    }

}
