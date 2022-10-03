package az.rock.jobber.ws.application.feign.privates;

import az.rock.jobber.ws.messenger.request.GRequest;
import az.rock.jobber.ws.spec.employee.privates.EmployeePrivateFeignSpec;
import az.rock.jobber.ws.messenger.response.GDataResponse;
import az.rock.jobber.ws.messenger.response.success.SuccessGDataResponse;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping(value = "/employee/private/feign")
@RequiredArgsConstructor
public class EmployeePrivatePrivateFeignController implements EmployeePrivateFeignSpec {

    @Override
    @RequestMapping(method = RequestMethod.GET, value = "/health")
    public GDataResponse<String> health() {
        log.info("EMPLOYEE SERVICE HEALTH CHECK");
        return new SuccessGDataResponse<>("OKEY");
    }

    @RequestMapping(method = RequestMethod.POST, value = "/createEmp", consumes = "application/json")
    public GDataResponse<String> createEmployee(GRequest gRequest){
        log.info(gRequest.toString());
        return new SuccessGDataResponse<>("OKEY");
    }

}
