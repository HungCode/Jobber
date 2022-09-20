package az.rock.waffle.ws.application.rest;

import az.rock.waffle.ws.container.aspect.anno.JLogger;
import az.rock.waffle.ws.domain.applicationService.create.CreateUserCommand;
import az.rock.waffle.ws.domain.applicationService.create.CreateUserResponse;
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
@RequestMapping(value = "/users/post/", method = RequestMethod.POST, produces = { "application/json"},consumes = {"application/json"})
@RequiredArgsConstructor
public class PostController {
    private final AbstractSuccessGResponseFactory<ResponseData> responseFactory;
    private final UserService userService;

    @JLogger
    @PostMapping(value = "registry")
    public ResponseEntity<GDataResponse<ResponseData>> registry(@RequestBody CreateUserCommand createUserCommand) {
        return new ResponseEntity<>(this.responseFactory
                .createSuccessGDataResponse(this.userService.createUser(createUserCommand)),HttpStatus.CREATED);
    }

}