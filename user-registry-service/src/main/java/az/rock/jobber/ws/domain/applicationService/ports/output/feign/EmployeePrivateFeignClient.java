package az.rock.jobber.ws.domain.applicationService.ports.output.feign;

import az.rock.jobber.ws.messenger.request.GRequest;
import az.rock.jobber.ws.domain.applicationService.anno.Fallback;
import az.rock.jobber.ws.domain.applicationService.anno.FallbackFactory;
import az.rock.jobber.ws.domain.applicationService.exception.feign.JFeignException;
import az.rock.jobber.ws.messenger.response.GDataTransfer;
import az.rock.jobber.ws.messenger.response.fail.FailGDataTransfer;
import az.rock.jobber.ws.spec.employee.privates.EmployeePrivateFeignSpec;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "employee-service",path = "/emp/feign",fallback = EmployeeFeignClientFallbackFactory.class)
public interface EmployeePrivateFeignClient extends EmployeePrivateFeignSpec {

    @Override
    @RequestMapping(method = RequestMethod.POST, value = "/createEmp", consumes = "application/json")
    GDataTransfer<String> createEmployee(GRequest gRequest);

    @Override
    @RequestMapping(method = RequestMethod.GET, value = "/health")
    GDataTransfer<String> health();

}

@FallbackFactory
class EmployeeFeignClientFallbackFactory implements org.springframework.cloud.openfeign.FallbackFactory<EmployeePrivateFeignClient> {
    @Override
    public EmployeePrivateFeignClient create(Throwable cause) {
        return new EmployeePrivateFeignClientFallback(cause);
    }
}

@Slf4j
@Fallback
class EmployeePrivateFeignClientFallback implements EmployeePrivateFeignClient {

    private final Throwable throwable;

    public EmployeePrivateFeignClientFallback(Throwable throwable) {
        this.throwable = throwable;
    }

    @Override
    public GDataTransfer<String> createEmployee(GRequest gRequest) {
        if (throwable instanceof JFeignException jFeignException){
            log.error("Unknown Feign Exception");
        }
        return new FailGDataTransfer<>("Bilinməyən bir xəta oldu");
    }

    @Override
    public GDataTransfer<String> health() {
        return null;
    }
}