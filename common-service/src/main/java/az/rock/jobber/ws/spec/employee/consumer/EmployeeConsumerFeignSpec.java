package az.rock.jobber.ws.spec.employee.consumer;

import az.rock.jobber.ws.messenger.transfer.GDataTransfer;
import az.rock.jobber.ws.spec.ApiSpec;

@ApiSpec(uri = "/employee/consumer/feign")
public interface EmployeeConsumerFeignSpec {
    GDataTransfer<String> health();
}
