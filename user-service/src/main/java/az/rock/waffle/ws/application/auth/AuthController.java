package az.rock.waffle.ws.application.auth;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/users/auth/",
        method = RequestMethod.POST,
        produces = { "application/json"},consumes = {"application/json"})
@RequiredArgsConstructor
public class AuthController {

}
