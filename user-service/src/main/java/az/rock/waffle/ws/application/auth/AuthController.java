package az.rock.waffle.ws.application.auth;

import az.rock.waffle.ws.response.ResponseData;
import az.rock.waffle.ws.response.factory.AbstractSuccessGResponseFactory;
import az.rock.waffle.ws.response.success.SuccessGResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/users/auth/")
@RequiredArgsConstructor
public class AuthController {
    private final AbstractSuccessGResponseFactory<ResponseData> successGResponseFactory;

    @GetMapping("/health")
    public ResponseEntity<SuccessGResponse> health(){
        return ResponseEntity.ok(successGResponseFactory.createSuccessGResponse());
    }
}
