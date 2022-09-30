package az.rock.jobber.ws.application.api.feign;

import az.rock.jobber.ws.apiObject.CreateResumeRequest;
import az.rock.jobber.ws.response.GDataResponse;
import az.rock.jobber.ws.response.success.SuccessGDataResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/emp/feign")
@RequiredArgsConstructor
public class EmployeeFeignController {

    @RequestMapping(method = RequestMethod.POST, value = "/createEmp", consumes = "application/json")
    GDataResponse<String> createEmployee(CreateResumeRequest createResumeRequest){
        System.out.println("OKKKK  EMPLOYEE");
        return new SuccessGDataResponse<String>("Tamamland;");
    }

}
