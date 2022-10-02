package az.rock.jobber.ws.application.feign;

import az.rock.jobber.ws.apiObject.CreateResumeRequest;
import az.rock.jobber.ws.spec.emp.EmployeeFeignSpec;
import az.rock.jobber.ws.response.GDataResponse;
import az.rock.jobber.ws.response.success.SuccessGDataResponse;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping(value = "/emp/feign")
@RequiredArgsConstructor
public class EmployeeFeignController implements EmployeeFeignSpec {

    @Override
    @RequestMapping(method = RequestMethod.GET, value = "/health")
    public GDataResponse<String> health() {
        log.info("EMPLOYEE SERVICE HEALTH CHECK");
        return new SuccessGDataResponse<>("OKEY");
    }

    @RequestMapping(method = RequestMethod.POST, value = "/createEmp", consumes = "application/json")
    public GDataResponse<String> createEmployee(CreateResumeRequest createResumeRequest){
        log.info(createResumeRequest.toString());
        return new SuccessGDataResponse<>("OKEY");
    }

}
