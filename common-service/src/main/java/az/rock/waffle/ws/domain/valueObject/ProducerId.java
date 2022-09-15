package az.rock.waffle.ws.domain.valueObject;

import java.util.UUID;

public class ProducerId extends GBaseId<UUID> {
    public ProducerId(UUID value) {
        super(value);
    }
}