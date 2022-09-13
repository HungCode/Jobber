package az.rock.waffle.ws.response;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.UUID;

public abstract class GResponse {
    private final UUID responseIdentifier;
    private final Boolean success;
    private final ZonedDateTime zonedDateTime;
    private final String message;
    private final String httpStatusCode;

    public GResponse(Boolean success, String message, String httpStatusCode) {
        this.responseIdentifier = UUID.randomUUID();
        this.success = success;
        this.zonedDateTime = ZonedDateTime.now(ZoneId.of("UTC"));
        this.message = message;
        this.httpStatusCode = httpStatusCode;
    }


    public GResponse(Boolean success, String httpStatusCode) {
        this.responseIdentifier = UUID.randomUUID();
        this.success = success;
        this.zonedDateTime = ZonedDateTime.now(ZoneId.of("UTC"));
        this.message = "";
        this.httpStatusCode = httpStatusCode;
    }

    public GResponse(Boolean success) {
        this.responseIdentifier = UUID.randomUUID();
        this.success = success;
        this.zonedDateTime = ZonedDateTime.now(ZoneId.of("UTC"));
        this.message = "";
        this.httpStatusCode = this.getDefaultStatusCode();
    }

    private String getDefaultStatusCode() {
        return success ? "200 OK" : "500 Internal Server Error";
    }


    public UUID getResponseIdentifier() {
        return responseIdentifier;
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
