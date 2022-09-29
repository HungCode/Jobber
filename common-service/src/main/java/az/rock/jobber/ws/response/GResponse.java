package az.rock.jobber.ws.response;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.UUID;

public abstract class GResponse {
    private final UUID responseID;
    private final Boolean success;
    private final ZonedDateTime zonedDateTime;
    private final String message;
    private final String httpStatusCode;

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
}
