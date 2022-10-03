package az.rock.jobber.ws.messenger.response;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.UUID;

public class GTransfer {
    private  UUID transferID = UUID.randomUUID();
    private  ZonedDateTime time = ZonedDateTime.now(ZoneId.of("UTC"));
    private  Boolean success;
    private  String message;
    private  String httpStatusCode;

    public GTransfer(){
        this.message = "";
        this.httpStatusCode = this.getDefaultStatusCode();
    }

    public GTransfer(Boolean success) {
        this();
        this.success = success;
    }

    public GTransfer(Boolean success, String httpStatusCode) {
        this(success);
        this.httpStatusCode = httpStatusCode;
    }

    public GTransfer(Boolean success, String message, String httpStatusCode) {
        this(success, httpStatusCode);
        this.message = message;
    }

    private String getDefaultStatusCode() {
        return success ? "200 OK" : "500 Internal Server Error";
    }

    public UUID getTransferID() {
        return transferID;
    }

    public Boolean getSuccess() {
        return success;
    }

    public ZonedDateTime getTime() {
        return time;
    }

    public String getMessage() {
        return message;
    }

    public String getHttpStatusCode() {
        return httpStatusCode;
    }

    public void setTransferID(UUID transferID) {
        this.transferID = transferID;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public void setTime(ZonedDateTime time) {
        this.time = time;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setHttpStatusCode(String httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
    }
}
