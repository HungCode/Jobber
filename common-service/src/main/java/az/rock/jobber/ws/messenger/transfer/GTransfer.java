package az.rock.jobber.ws.messenger.transfer;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.UUID;

public class GTransfer {
    private  UUID transferID = UUID.randomUUID();
    private  ZonedDateTime time = ZonedDateTime.now(ZoneId.of("UTC"));


    public GTransfer(){}

    public UUID getTransferID() {
        return transferID;
    }

    public ZonedDateTime getTime() {
        return time;
    }

    public void setTransferID(UUID transferID) {
        this.transferID = transferID;
    }

    public void setTime(ZonedDateTime time) {
        this.time = time;
    }

}
