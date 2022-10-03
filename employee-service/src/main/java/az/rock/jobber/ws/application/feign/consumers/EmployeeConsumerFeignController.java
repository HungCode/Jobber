package az.rock.jobber.ws.application.feign.consumers;

import az.rock.jobber.ws.messenger.response.GDataTransfer;
import az.rock.jobber.ws.spec.employee.consumer.EmployeeConsumerFeignSpec;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping(value = "/employee/consumer/feign")
@RequiredArgsConstructor
public class EmployeeConsumerFeignController implements EmployeeConsumerFeignSpec {

    @Override
    public GDataTransfer<String> health() {
        return null;
    }
}
