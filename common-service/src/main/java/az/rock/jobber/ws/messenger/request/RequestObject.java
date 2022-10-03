package az.rock.jobber.ws.messenger.request;

import java.util.UUID;

public abstract class RequestObject {
    private final UUID userUUID;

    protected RequestObject(UUID userUUID) {
        this.userUUID = userUUID;
    }

    public UUID getUserUUID() {
        return userUUID;
    }
}
