package az.rock.jobber.ws.apiObject;

import java.util.UUID;

public class CreateResumeRequest implements RequestObject{
    private final UUID userUUID;

    public CreateResumeRequest(UUID userUUID) {
        this.userUUID = userUUID;
    }

    public UUID getUserUUID() {
        return userUUID;
    }
}
