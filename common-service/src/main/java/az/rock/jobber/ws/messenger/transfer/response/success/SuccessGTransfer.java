package az.rock.jobber.ws.messenger.transfer.response.success;

import az.rock.jobber.ws.messenger.transfer.GTransfer;
import az.rock.jobber.ws.messenger.transfer.response.GResponseTransfer;

public final class SuccessGTransfer extends GResponseTransfer {
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
