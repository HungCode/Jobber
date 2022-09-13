package az.rock.waffle.ws.response.success;

import az.rock.waffle.ws.response.GResponse;

public final class SuccessGResponse extends GResponse {
    public SuccessGResponse( String message, String httpStatusCode) {
        super(true, message, httpStatusCode);
    }

    public SuccessGResponse( String httpStatusCode) {
        this("Successful", httpStatusCode);
    }

    public SuccessGResponse() {
        super(true);
    }

}
