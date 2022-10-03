package az.rock.jobber.ws.messenger.response;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.UUID;

public class GResponse {
    private  UUID responseID;
    private  Boolean success;
    private  ZonedDateTime zonedDateTime;
    private  String message;
    private  String httpStatusCode;

    public GResponse(){}

    public GResponse(Boolean success, String message, String httpStatusCode) {
        this.responseID = UUID.randomUUID();
        this.success = success;
        this.zonedDateTime = ZonedDateTime.now(ZoneId.of("UTC"));
        this.message = message;
        this.httpStatusCode = httpStatusCode;
    }


    public GResponse(Boolean success, String httpStatusCode) {
        this.responseID = UUID.randomUUID();
        this.success = success;
        this.zonedDateTime = ZonedDateTime.now(ZoneId.of("UTC"));
        this.message = "";
        this.httpStatusCode = httpStatusCode;
    }

    public GResponse(Boolean success) {
        this.responseID = UUID.randomUUID();
        this.success = success;
        this.zonedDateTime = ZonedDateTime.now(ZoneId.of("UTC"));
        this.message = "";
        this.httpStatusCode = this.getDefaultStatusCode();
    }

    private String getDefaultStatusCode() {
        return success ? "200 OK" : "500 Internal Server Error";
    }


    public UUID getResponseID() {
        return responseID;
    }

    public Boolean getSuccess() {
        return success;
    }

    public ZonedDateTime getZonedDateTime() {
        return zonedDateTime;
    }

    public String getMessage() {
        return message;
    }

    public String getHttpStatusCode() {
        return httpStatusCode;
    }

    public void setResponseID(UUID responseID) {
        this.responseID = responseID;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public void setZonedDateTime(ZonedDateTime zonedDateTime) {
        this.zonedDateTime = zonedDateTime;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setHttpStatusCode(String httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
    }
}
