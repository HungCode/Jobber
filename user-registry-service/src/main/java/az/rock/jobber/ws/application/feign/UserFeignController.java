package az.rock.jobber.ws.application.feign;

import az.rock.jobber.ws.container.aspect.anno.JLogger;
import az.rock.jobber.ws.messenger.transfer.response.success.SuccessGDataTransfer;
import az.rock.jobber.ws.messenger.transfer.response.success.SuccessGTransfer;
import feign.HeaderMap;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;
import java.util.UUID;

@RestController
@RequestMapping(value = "/users/auth/feign/uuid")
@RequiredArgsConstructor
public class UserFeignController {
    @JLogger
    @GetMapping("/employee")
    public ResponseEntity<SuccessGDataTransfer<UUID>> employeeUUID(@HeaderMap Map<String, Object> headers){
        return null;
    }

    @JLogger
    @GetMapping("/company")
    public ResponseEntity<SuccessGDataTransfer<UUID>> companyUUID(@HeaderMap Map<String, Object> headers){
        return null;
    }
}
