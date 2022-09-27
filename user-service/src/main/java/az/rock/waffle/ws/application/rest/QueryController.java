package az.rock.waffle.ws.application.rest;

import az.rock.waffle.ws.container.aspect.anno.JLogger;
import az.rock.waffle.ws.domain.applicationService.dto.create.CreateUserCommand;
import az.rock.waffle.ws.domain.applicationService.ports.input.service.abst.UserService;
import az.rock.waffle.ws.response.GDataResponse;
import az.rock.waffle.ws.response.GResponse;
import az.rock.waffle.ws.response.ResponseData;
import az.rock.waffle.ws.response.factory.AbstractSuccessGResponseFactory;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/users/profile/query")
@RequiredArgsConstructor
public class QueryController {
    private final AbstractSuccessGResponseFactory<ResponseData> responseFactory;
    private final UserService userService;


    @JLogger
    @GetMapping(value = "apply")
    public ResponseEntity<GResponse> apply() {
        return ResponseEntity.ok(responseFactory.createSuccessGResponse());
    }


}