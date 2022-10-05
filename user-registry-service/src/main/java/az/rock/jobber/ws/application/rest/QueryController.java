package az.rock.jobber.ws.application.rest;

import az.rock.jobber.ws.container.aspect.anno.JLogger;
import az.rock.jobber.ws.domain.application.ports.input.service.abst.UserService;
import az.rock.jobber.ws.messenger.transfer.GTransfer;
import az.rock.jobber.ws.messenger.transfer.ResponseData;
import az.rock.jobber.ws.messenger.transfer.factory.AbstractSuccessGResponseFactory;
import lombok.RequiredArgsConstructor;
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
    public ResponseEntity<GTransfer> apply() {
        return ResponseEntity.ok(responseFactory.createSuccessGResponse());
    }


}