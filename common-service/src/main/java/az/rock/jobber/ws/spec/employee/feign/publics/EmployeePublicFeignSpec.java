package az.rock.jobber.ws.spec.employee.feign.publics;

import az.rock.jobber.ws.messenger.transfer.GDataTransfer;
import az.rock.jobber.ws.spec.annotation.ApiSpec;

@ApiSpec(uri = "/employee/public/feign")
public interface EmployeePublicFeignSpec {
    GDataTransfer<String> health();
}
