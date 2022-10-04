package az.rock.jobber.ws.domain.applicationService.ports.output.feign;

import az.rock.jobber.ws.domain.applicationService.anno.Fallback;
import az.rock.jobber.ws.domain.applicationService.anno.FallbackFactory;
import az.rock.jobber.ws.domain.applicationService.exception.feign.JFeignException;
import az.rock.jobber.ws.messenger.transfer.request.GRequestDataTransfer;
import az.rock.jobber.ws.messenger.transfer.response.GResponseDataTransfer;
import az.rock.jobber.ws.messenger.transfer.response.fail.FailGDataTransfer;
import az.rock.jobber.ws.spec.employee.privates.EmployeePrivateFeignSpec;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
//,fallback = EmployeeFeignClientFallbackFactory.class


@FeignClient(name = "employee-service",path = "/employee/private/feign")
public interface EmployeeFeignClient extends EmployeePrivateFeignSpec {

    @Override
    @RequestMapping(method = RequestMethod.POST, value = "/createEmp", consumes = "application/json")
    GResponseDataTransfer<String> createEmployee(GRequestDataTransfer<String> gRequestDataTransfer);

    @Override
    @RequestMapping(method = RequestMethod.GET, value = "/health")
    GResponseDataTransfer<String> health();

}
//
//@FallbackFactory
//class EmployeeFeignClientFallbackFactory implements org.springframework.cloud.openfeign.FallbackFactory<EmployeeFeignClient> {
//    @Override
//    public EmployeeFeignClient create(Throwable cause) {
//        return new EmployeeFeignClientFallback(cause);
//    }
//}
//
//@Slf4j
//@Fallback
//class EmployeeFeignClientFallback implements EmployeeFeignClient{
//
//    private final Throwable throwable;
//
//    public EmployeeFeignClientFallback(Throwable throwable) {
//        this.throwable = throwable;
//    }
//
//    @Override
//    public GResponseDataTransfer<String> createEmployee(GRequestDataTransfer<String> gRequestDataTransfer) {
//        if (throwable instanceof JFeignException jFeignException){
//            log.error("Unknown Feign Exception");
//        }
//        return new FailGDataTransfer<>("Bilinməyən bir xəta oldu");
//    }
//
//    @Override
//    public GResponseDataTransfer<String> health() {
//        return null;
//    }
//}