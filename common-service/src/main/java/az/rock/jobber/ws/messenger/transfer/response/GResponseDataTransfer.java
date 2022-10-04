package az.rock.jobber.ws.messenger.transfer.response;

import az.rock.jobber.ws.messenger.transfer.GDataTransfer;

public class GResponseDataTransfer<T> extends GDataTransfer<T> {
    private Boolean success;
    private String httpStatusCode;
    private String message;

    public GResponseDataTransfer(){super();}

    public GResponseDataTransfer(Boolean success, T data) {
        super(data);
        this.success = success;
    }

    public GResponseDataTransfer(Boolean success, String message, T data) {
        this(success,data);
        this.message = message;
    }

    public GResponseDataTransfer(Boolean success, String message, String httpStatusCode, T data) {
        this(success,message,data);
        this.httpStatusCode = httpStatusCode;
    }

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public String getHttpStatusCode() {
        return httpStatusCode;
    }

    public void setHttpStatusCode(String httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
