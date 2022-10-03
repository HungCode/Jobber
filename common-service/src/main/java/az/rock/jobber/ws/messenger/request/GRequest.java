package az.rock.jobber.ws.messenger.request;

import java.util.UUID;

@JRequest
public class GRequest extends RequestObject {

    public GRequest(UUID userUUID) {
        super(userUUID);
    }

}
