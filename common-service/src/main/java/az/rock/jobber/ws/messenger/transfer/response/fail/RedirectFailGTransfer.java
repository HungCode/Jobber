package az.rock.jobber.ws.messenger.transfer.response.fail;

import az.rock.jobber.ws.messenger.transfer.GTransfer;
import az.rock.jobber.ws.messenger.transfer.request.GRequestTransfer;


public class RedirectFailGTransfer extends FailGTransfer {

    private String redirect;

    public RedirectFailGTransfer(String message, String httpStatusCode, String redirect) {
        super(message, httpStatusCode);
        this.redirect = redirect;
    }

    public RedirectFailGTransfer(String message, String redirect) {
        super(message);
        this.redirect = redirect;
    }

    public RedirectFailGTransfer(String redirect) {
        super();
        this.redirect = redirect;
    }

    public String getRedirect() {
        return redirect;
    }

    public void setRedirect(String redirect) {
        this.redirect = redirect;
    }
}
