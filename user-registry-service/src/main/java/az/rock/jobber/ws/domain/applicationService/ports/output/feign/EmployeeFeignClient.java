package az.rock.jobber.ws.domain.applicationService.ports.output.feign;

import az.rock.jobber.ws.apiObject.CreateResumeRequest;
import az.rock.jobber.ws.response.GDataResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@FeignClient(name = "employee-service",path = "emp/feign")
public interface EmployeeFeignClient {

    @RequestMapping(method = RequestMethod.POST, value = "/createEmp", consumes = "application/json")
    GDataResponse<String> createEmployee(CreateResumeRequest createResumeRequest);

}
