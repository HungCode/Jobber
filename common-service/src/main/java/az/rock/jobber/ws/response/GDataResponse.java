package az.rock.jobber.ws.response;

public abstract class GDataResponse <T> extends GResponse {
    private final T data;

    public GDataResponse(Boolean success, String message, String httpStatusCode,T data) {
        super(success, message, httpStatusCode);
        this.data = data;
    }

    public GDataResponse(Boolean success, String httpStatusCode, T data) {
        super(success, httpStatusCode);
        this.data = data;
    }

    public GDataResponse(Boolean success, T data) {
        super(success);
        this.data = data;
    }

    public T getData() {
        return this.data;
    }
}
