package az.rock.jobber.ws.domain.applicationService.ports.output.feign;

import az.rock.jobber.ws.apiObject.CreateResumeRequest;
import az.rock.jobber.ws.domain.applicationService.anno.Fallback;
import az.rock.jobber.ws.domain.applicationService.anno.FallbackFactory;
import az.rock.jobber.ws.domain.applicationService.exception.feign.JFeignException;
import az.rock.jobber.ws.exception.GRuntimeException;
import az.rock.jobber.ws.response.GDataResponse;
import az.rock.jobber.ws.response.fail.FailGDataResponse;
import az.rock.jobber.ws.response.fail.FailGResponse;
import az.rock.jobber.ws.spec.emp.EmployeeFeignSpec;
import feign.FeignException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "employee-service",path = "/emp/feign",fallback = EmployeeFeignClientFallbackFactory.class)
public interface EmployeeFeignClient extends EmployeeFeignSpec {

    @Override
    @RequestMapping(method = RequestMethod.POST, value = "/createEmp", consumes = "application/json")
    GDataResponse<String> createEmployee(CreateResumeRequest createResumeRequest);

    @Override
    @RequestMapping(method = RequestMethod.GET, value = "/health")
    GDataResponse<String> health();

}

@FallbackFactory
class EmployeeFeignClientFallbackFactory implements org.springframework.cloud.openfeign.FallbackFactory<EmployeeFeignClient> {
    @Override
    public EmployeeFeignClient create(Throwable cause) {
        return new EmployeeFeignClientFallback(cause);
    }
}

@Slf4j
@Fallback
class EmployeeFeignClientFallback implements EmployeeFeignClient{

    private final Throwable throwable;

    public EmployeeFeignClientFallback(Throwable throwable) {
        this.throwable = throwable;
    }

    @Override
    public GDataResponse<String> createEmployee(CreateResumeRequest createResumeRequest) {
        if (throwable instanceof JFeignException jFeignException){
            log.error("Unknown Feign Exception");
        }
        //TODO MessageProvider isdifade edilmelidir
        return new FailGDataResponse<>("Bilinməyən bir problem oldu. :( Hal hazırda həll etməyə çalışırıq");
    }

    @Override
    public GDataResponse<String> health() {
        return null;
    }
}