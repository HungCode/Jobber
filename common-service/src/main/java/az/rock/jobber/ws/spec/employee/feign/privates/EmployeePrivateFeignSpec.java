package az.rock.jobber.ws.spec.employee.feign.privates;

import az.rock.jobber.ws.messenger.transfer.request.GRequestDataTransfer;
import az.rock.jobber.ws.messenger.transfer.response.GResponseDataTransfer;
import az.rock.jobber.ws.spec.annotation.ApiSpec;

@ApiSpec(uri = "/employee/private/feign")
public interface EmployeePrivateFeignSpec {
    GResponseDataTransfer<String> health();
    GResponseDataTransfer<String> createEmployee(GRequestDataTransfer<String> createResumeRequest);
}
