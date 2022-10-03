package az.rock.jobber.ws.spec.employee.privates;

import az.rock.jobber.ws.messenger.request.GRequest;
import az.rock.jobber.ws.messenger.response.GDataTransfer;
import az.rock.jobber.ws.spec.ApiSpec;

@ApiSpec(uri = "/employee/private/feign")
public interface EmployeePrivateFeignSpec {
    GDataTransfer<String> health();
    GDataTransfer<String> createEmployee(GRequest gRequest);
}
