package az.rock.jobber.ws.domain.valueObject;

import java.util.UUID;


public class OrderId extends GBaseId<UUID> {
    public OrderId(UUID value) {
        super(value);
    }
}