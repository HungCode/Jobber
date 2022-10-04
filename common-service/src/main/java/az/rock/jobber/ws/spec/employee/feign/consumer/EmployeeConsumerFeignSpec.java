package az.rock.jobber.ws.spec.employee.feign.consumer;

import az.rock.jobber.ws.messenger.transfer.GDataTransfer;
import az.rock.jobber.ws.spec.annotation.ApiSpec;

@ApiSpec(uri = "/employee/consumer/feign")
public interface EmployeeConsumerFeignSpec {
    GDataTransfer<String> health();
}
