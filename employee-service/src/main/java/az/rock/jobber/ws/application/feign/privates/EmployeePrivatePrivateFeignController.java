package az.rock.jobber.ws.application.feign.privates;

import az.rock.jobber.ws.messenger.transfer.request.GRequestDataTransfer;
import az.rock.jobber.ws.messenger.transfer.response.GResponseDataTransfer;
import az.rock.jobber.ws.spec.employee.feign.privates.EmployeePrivateFeignSpec;
import az.rock.jobber.ws.messenger.transfer.response.success.SuccessGDataTransfer;
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
    public GResponseDataTransfer<String> health() {
        log.info("EMPLOYEE SERVICE HEALTH CHECK");
        return new SuccessGDataTransfer<>("OKEY");
    }

    @Override
    @RequestMapping(method = RequestMethod.POST, value = "/createEmp", consumes = "application/json")
    public GResponseDataTransfer<String> createEmployee(GRequestDataTransfer<String> createResumeRequest) {
        log.info(createResumeRequest.toString());
        return new SuccessGDataTransfer<>("OKEY");
    }

}
