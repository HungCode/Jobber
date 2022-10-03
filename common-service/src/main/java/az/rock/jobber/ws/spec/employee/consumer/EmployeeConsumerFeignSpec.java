package az.rock.jobber.ws.spec.employee.consumer;

import az.rock.jobber.ws.messenger.response.GDataResponse;
import az.rock.jobber.ws.spec.ApiSpec;

@ApiSpec(uri = "/employee/consumer/feign")
public interface EmployeeConsumerFeignSpec {
    GDataResponse<String> health();
}
