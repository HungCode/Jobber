package az.rock.jobber.ws.messenger.transfer.response.fail;

import az.rock.jobber.ws.messenger.transfer.GTransfer;
import az.rock.jobber.ws.messenger.transfer.response.GResponseTransfer;

public class FailGTransfer extends GResponseTransfer {
    public FailGTransfer() {
        super(false);
    }

    public FailGTransfer(String message, String httpStatusCode) {
        super(false, message, httpStatusCode);
    }

    public FailGTransfer(String message) {
        this(message, "403");
    }
}