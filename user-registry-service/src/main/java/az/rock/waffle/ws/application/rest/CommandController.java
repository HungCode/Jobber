package az.rock.waffle.ws.application.rest;

import az.rock.waffle.ws.container.aspect.anno.JLogger;
import az.rock.waffle.ws.domain.applicationService.ports.input.service.abst.UserService;
import az.rock.waffle.ws.response.GResponse;
import az.rock.waffle.ws.response.ResponseData;
import az.rock.waffle.ws.response.factory.AbstractSuccessGResponseFactory;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users/profile/command")
@RequiredArgsConstructor
public class CommandController {
    private final AbstractSuccessGResponseFactory<ResponseData> responseFactory;
    private final UserService userService;


    @JLogger
    @GetMapping(value = "apply")
    public ResponseEntity<GResponse> apply() {
        return ResponseEntity.ok(responseFactory.createSuccessGResponse());
    }


}
