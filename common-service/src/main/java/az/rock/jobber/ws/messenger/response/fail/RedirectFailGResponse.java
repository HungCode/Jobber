package az.rock.jobber.ws.messenger.response.fail;

import az.rock.jobber.ws.messenger.response.GResponse;


public class RedirectFailGResponse extends GResponse {

    private final String redirect;

    public RedirectFailGResponse(String message, String httpStatusCode, String redirect) {
        super(false, message, httpStatusCode);
        this.redirect = redirect;
    }

    public RedirectFailGResponse(String httpStatusCode, String redirect) {
        super(false, httpStatusCode);
        this.redirect = redirect;
    }

    public RedirectFailGResponse(String redirect) {
        super(false);
        this.redirect = redirect;
    }

    public String getRedirect() {
        return redirect;
    }
}
