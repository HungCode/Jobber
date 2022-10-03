package az.rock.jobber.ws.messenger.response;

public class GDataTransfer<T> extends GTransfer {
    private  T data;

    public GDataTransfer(){super();}

    public GDataTransfer(Boolean success, String message, String httpStatusCode, T data) {
        super(success, message, httpStatusCode);
        this.data = data;
    }

    public GDataTransfer(Boolean success, String httpStatusCode, T data) {
        super(success, httpStatusCode);
        this.data = data;
    }

    public GDataTransfer(Boolean success, T data) {
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
