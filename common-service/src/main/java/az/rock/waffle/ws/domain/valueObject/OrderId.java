package az.rock.waffle.ws.domain.valueObject;

import java.util.UUID;


public class OrderId extends GBaseId<UUID> {
    public OrderId(UUID value) {
        super(value);
    }
}