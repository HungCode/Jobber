package az.rock.jobber.ws.messenger.request;

import java.util.UUID;

@JRequest
public class GDataRequest<D> extends GRequest{

    private final D data;

    public GDataRequest(UUID userUUID,D data) {
        super(userUUID);
        this.data = data;
    }

    public D getData() {
        return data;
    }
}
