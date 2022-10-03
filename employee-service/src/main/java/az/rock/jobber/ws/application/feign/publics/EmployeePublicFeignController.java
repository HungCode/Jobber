package az.rock.jobber.ws.application.feign.publics;

import az.rock.jobber.ws.messenger.response.GDataTransfer;
import az.rock.jobber.ws.spec.employee.publics.EmployeePublicFeignSpec;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping(value = "/employee/public/feign")
@RequiredArgsConstructor
public class EmployeePublicFeignController implements EmployeePublicFeignSpec {
    @Override
    public GDataTransfer<String> health() {
        return null;
    }
}
