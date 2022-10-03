package az.rock.jobber.ws.spec.employee.publics;

import az.rock.jobber.ws.messenger.response.GDataResponse;
import az.rock.jobber.ws.spec.ApiSpec;

@ApiSpec(uri = "/employee/public/feign")
public interface EmployeePublicFeignSpec {
    GDataResponse<String> health();
}
