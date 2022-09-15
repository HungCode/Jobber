package az.rock.waffle.ws.application.handler;

import az.rock.waffle.ws.exception.GException;
import az.rock.waffle.ws.handler.GExceptionHandler;
import az.rock.waffle.ws.response.ResponseData;
import az.rock.waffle.ws.response.factory.AbstractFailGResponseFactory;
import az.rock.waffle.ws.response.fail.FailGDataResponse;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@Slf4j
@RestControllerAdvice
@RequiredArgsConstructor
public class UserGExceptionHandler extends GExceptionHandler {
    private final AbstractFailGResponseFactory<ResponseData> responseFactory;

    @ResponseBody
    @ExceptionHandler(value = {GException.class})
    public ResponseEntity<FailGDataResponse<?>> handleException(GException userDomainException) {
        log.error(userDomainException.getMessage(), userDomainException);
        return new ResponseEntity<>(
                this.responseFactory
                        .createFailGDataResponse(null),HttpStatus.BAD_REQUEST );
    }


}
