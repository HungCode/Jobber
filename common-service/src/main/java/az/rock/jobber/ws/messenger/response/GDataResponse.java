package az.rock.jobber.ws.messenger.response;

public class GDataResponse <T> extends GResponse {
    private  T data;

    public GDataResponse(){super();}

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

    public void setData(T data) {
        this.data = data;
    }
}
