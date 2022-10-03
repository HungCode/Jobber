package az.rock.jobber.ws.messenger.transfer.request;

import az.rock.jobber.ws.messenger.transfer.GDataTransfer;

import java.util.UUID;

public class GRequestDataTransfer<T> extends GDataTransfer<T> {

    private UUID userUUID;

    public GRequestDataTransfer(UUID userUUID,T data){
        super(data);
        this.userUUID = userUUID;
    }

    public UUID getUserUUID() {
        return userUUID;
    }

    public void setUserUUID(UUID userUUID) {
        this.userUUID = userUUID;
    }
}
