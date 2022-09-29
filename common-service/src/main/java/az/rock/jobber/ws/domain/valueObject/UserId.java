package az.rock.jobber.ws.domain.valueObject;

import java.util.UUID;

public class UserId extends GBaseId<UUID> {
    public UserId(UUID value) {
        super(value);
    }
}