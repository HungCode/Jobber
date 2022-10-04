package az.rock.jobber.ws.spec.employee.api.consumer;

import az.rock.jobber.ws.messenger.transfer.request.GRequestDataTransfer;
import az.rock.jobber.ws.messenger.transfer.response.success.SuccessGDataTransfer;
import az.rock.jobber.ws.spec.annotation.ApiSpec;

import java.util.UUID;

@ApiSpec(uri = "/employee/consumer/api")
public interface EmployeeConsumerSpec {
    SuccessGDataTransfer<?> getResume(GRequestDataTransfer<UUID> requestDataTransfer);

}
