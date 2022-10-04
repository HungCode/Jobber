package az.rock.jobber.ws.messenger.transfer;

public class GDataTransfer<T> extends GTransfer {
    private  T data;

    public GDataTransfer(){super();}

    public GDataTransfer(T data) {
        this.data = data;
    }

    public T getData() {
        return this.data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
