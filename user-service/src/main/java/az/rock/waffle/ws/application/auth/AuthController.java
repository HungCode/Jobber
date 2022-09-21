package az.rock.waffle.ws.application.auth;

import az.rock.waffle.ws.container.aspect.anno.JLogger;
import az.rock.waffle.ws.domain.applicationService.dto.auth.AuthUserCommand;
import az.rock.waffle.ws.domain.applicationService.ports.input.service.abst.UserService;
import az.rock.waffle.ws.response.GDataResponse;
import az.rock.waffle.ws.response.ResponseData;
import az.rock.waffle.ws.response.factory.AbstractSuccessGResponseFactory;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/users/auth/",
        method = RequestMethod.POST,
        produces = { "application/json"},consumes = {"application/json"})
@RequiredArgsConstructor
public class AuthController {
    private final AbstractSuccessGResponseFactory<ResponseData> responseFactory;
    private final UserService userService;

    @JLogger
    @PostMapping(value = "login")
    public ResponseEntity<GDataResponse<ResponseData>> registry(@RequestBody AuthUserCommand authUserCommand) {
        return null;
    }
}
