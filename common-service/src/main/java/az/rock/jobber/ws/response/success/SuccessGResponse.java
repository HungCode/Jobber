package az.rock.jobber.ws.response.success;

import az.rock.jobber.ws.response.GResponse;

public final class SuccessGResponse extends GResponse {
    public SuccessGResponse() {
        super(true);
    }

    public SuccessGResponse( String message, String httpStatusCode) {
        super(true, message, httpStatusCode);
    }
    public SuccessGResponse( String httpStatusCode) {
        this("Successful", httpStatusCode);
    }

}
