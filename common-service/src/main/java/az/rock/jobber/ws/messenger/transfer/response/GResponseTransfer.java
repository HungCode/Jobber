package az.rock.jobber.ws.messenger.transfer.response;

import az.rock.jobber.ws.messenger.transfer.GTransfer;

public class GResponseTransfer extends GTransfer {
    private Boolean success;
    private String httpStatusCode;
    private String message;

    public GResponseTransfer(){
        this.success = Boolean.FALSE;
        this.httpStatusCode="undefined";
        this.message="undefined";
    }

    public GResponseTransfer(Boolean success){
        this();
        this.success = success;
    }

    public GResponseTransfer(Boolean success,String message){
        this(success);
        this.message = message;
    }

    public GResponseTransfer(Boolean success,String message,String httpStatusCode){
        this(success,message);
        this.httpStatusCode = httpStatusCode;
    }

    public Boolean getSuccess() {
        return success;
    }

    public String getMessage() {
        return message;
    }

    public String getHttpStatusCode() {
        return httpStatusCode;
    }
}
