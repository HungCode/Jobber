package az.rock.waffle.ws.application.auth;

import az.rock.waffle.ws.container.aspect.anno.JLogger;
import az.rock.waffle.ws.domain.applicationService.dto.auth.AuthUserCommand;
import az.rock.waffle.ws.domain.applicationService.exception.security.GUserDetailsService;
import az.rock.waffle.ws.response.factory.AbstractSuccessGResponseFactory;
import az.rock.waffle.ws.response.success.SuccessGDataResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/users/auth/",
        method = RequestMethod.POST,
        produces = { "application/json"},consumes = {"application/json"})
@RequiredArgsConstructor
public class AuthController {
    //private final AbstractSuccessGResponseFactory<UserDetails> responseFactory;
    private final GUserDetailsService authService;

    @JLogger
    @PostMapping(value = "login")
    public ResponseEntity<?> registry(@RequestBody AuthUserCommand authUserCommand) {
        return new ResponseEntity<>(new SuccessGDataResponse<>(this.authService.loadUserByUsername(authUserCommand.username())),HttpStatus.ACCEPTED);
    }
}
