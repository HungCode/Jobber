package az.rock.jobber.ws.spec.employee.privates;

import az.rock.jobber.ws.messenger.request.GRequest;
import az.rock.jobber.ws.messenger.response.GDataResponse;
import az.rock.jobber.ws.spec.ApiSpec;

@ApiSpec(uri = "/employee/private/feign")
public interface EmployeePrivateFeignSpec {
    GDataResponse<String> health();
    GDataResponse<String> createEmployee(GRequest gRequest);
}
