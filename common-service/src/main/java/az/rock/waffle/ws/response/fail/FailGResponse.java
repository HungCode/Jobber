package az.rock.waffle.ws.response.fail;

import az.rock.waffle.ws.response.GResponse;

public final class FailGResponse extends GResponse {
    public FailGResponse(String message, String httpStatusCode) {
        super(false, message, httpStatusCode);
    }

    public FailGResponse( String httpStatusCode) {
        this("Fail", httpStatusCode);
    }

    public FailGResponse() {
        super(false);
    }

}