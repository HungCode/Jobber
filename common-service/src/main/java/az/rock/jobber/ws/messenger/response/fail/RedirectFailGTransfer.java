package az.rock.jobber.ws.messenger.response.fail;

import az.rock.jobber.ws.messenger.response.GTransfer;


public class RedirectFailGTransfer extends GTransfer {

    private final String redirect;

    public RedirectFailGTransfer(String message, String httpStatusCode, String redirect) {
        super(false, message, httpStatusCode);
        this.redirect = redirect;
    }

    public RedirectFailGTransfer(String httpStatusCode, String redirect) {
        super(false, httpStatusCode);
        this.redirect = redirect;
    }

    public RedirectFailGTransfer(String redirect) {
        super(false);
        this.redirect = redirect;
    }

    public String getRedirect() {
        return redirect;
    }
}
