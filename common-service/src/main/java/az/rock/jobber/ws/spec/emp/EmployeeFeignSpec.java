package az.rock.jobber.ws.spec.emp;

import az.rock.jobber.ws.apiObject.CreateResumeRequest;
import az.rock.jobber.ws.response.GDataResponse;
import az.rock.jobber.ws.spec.ApiSpec;

@ApiSpec
public interface EmployeeFeignSpec {
    GDataResponse<String> health();
    GDataResponse<String> createEmployee(CreateResumeRequest createResumeRequest);
}
