package az.rock.jobber.ws.domain.valueObject;

import java.util.UUID;

public class ProductId extends GBaseId<UUID> {
    public ProductId(UUID value) {
        super(value);
    }
}