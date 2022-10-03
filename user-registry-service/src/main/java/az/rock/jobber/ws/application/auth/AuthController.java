package az.rock.jobber.ws.application.auth;

import az.rock.jobber.ws.container.aspect.anno.JLogger;
import az.rock.jobber.ws.domain.applicationService.dto.create.CreateUserCommand;
import az.rock.jobber.ws.domain.applicationService.ports.input.service.abst.UserService;
import az.rock.jobber.ws.messenger.response.GDataTransfer;
import az.rock.jobber.ws.messenger.response.ResponseData;
import az.rock.jobber.ws.messenger.response.factory.AbstractSuccessGResponseFactory;
import az.rock.jobber.ws.messenger.response.success.SuccessGTransfer;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
    @RequestMapping(value = "/users/auth/")
@RequiredArgsConstructor
public class AuthController {
    private final AbstractSuccessGResponseFactory<ResponseData> successGResponseFactory;
    private final UserService userService;

    @JLogger
    @GetMapping("health")
    public ResponseEntity<SuccessGTransfer> health(){
        return ResponseEntity.ok(successGResponseFactory.createSuccessGResponse());
    }

    @JLogger
    @PostMapping(value = "registry")
    public ResponseEntity<GDataTransfer<ResponseData>> registry(@RequestBody CreateUserCommand createUserCommand) {
        return new ResponseEntity<>(this.successGResponseFactory
                .createSuccessGDataResponse(this.userService.createUser(createUserCommand)), HttpStatus.CREATED);
    }
}
