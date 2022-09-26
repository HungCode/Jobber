package az.rock.waffle.ws.application.rest;

import az.rock.waffle.ws.container.aspect.anno.JLogger;
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
@RequestMapping(value = "/users/get/", method = RequestMethod.GET)
@RequiredArgsConstructor
public class GetController {
    private final AbstractSuccessGResponseFactory<ResponseData> responseFactory;


    @JLogger
    @GetMapping(value = "apply")
    public ResponseEntity<GResponse> apply() {
        return ResponseEntity.ok(responseFactory.createSuccessGResponse());
    }
}
