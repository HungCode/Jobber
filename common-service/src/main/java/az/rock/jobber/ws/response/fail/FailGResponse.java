package az.rock.jobber.ws.response.fail;

import az.rock.jobber.ws.response.GResponse;

public final class FailGResponse extends GResponse {
    public FailGResponse() {
        super(false);
    }

    public FailGResponse(String message, String httpStatusCode) {
        super(false, message, httpStatusCode);
    }

    public FailGResponse( String httpStatusCode) {
        this("Fail", httpStatusCode);
    }



}