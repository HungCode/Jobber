package az.rock.jobber.ws.spec.employee.privates;

import az.rock.jobber.ws.messenger.transfer.GDataTransfer;
import az.rock.jobber.ws.messenger.transfer.request.GRequestDataTransfer;
import az.rock.jobber.ws.messenger.transfer.response.GResponseDataTransfer;
import az.rock.jobber.ws.spec.ApiSpec;

@ApiSpec(uri = "/employee/private/feign")
public interface EmployeePrivateFeignSpec {
    public GResponseDataTransfer<String> health();
    public GResponseDataTransfer<String> createEmployee(GRequestDataTransfer<String> createResumeRequest);
}
