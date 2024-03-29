package az.rock.jobber.ws.application.handler;

import az.rock.jobber.ws.domain.application.exception.security.UnknownSecurityException;
import az.rock.jobber.ws.domain.application.exception.security.UserNotFoundSecurityException;
import az.rock.jobber.ws.exception.GException;
import az.rock.jobber.ws.handler.GExceptionHandler;
import az.rock.jobber.ws.messenger.transfer.ResponseData;
import az.rock.jobber.ws.messenger.transfer.factory.AbstractFailGResponseFactory;
import az.rock.jobber.ws.messenger.transfer.response.fail.FailGDataTransfer;
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
    public ResponseEntity<FailGDataTransfer<?>> handleException(GException userDomainException) {
        log.error(userDomainException.getMessage(), userDomainException);
        return new ResponseEntity<>(
                this.responseFactory
                        .createFailGDataResponse(null),HttpStatus.BAD_REQUEST );
    }

    @ResponseBody
    @ExceptionHandler(value = {UserNotFoundSecurityException.class})
    public ResponseEntity<FailGDataTransfer<?>> userNotFoundSecurityException(UserNotFoundSecurityException userDomainException) {
        log.error(userDomainException.getMessage(), userDomainException);
        return new ResponseEntity<>(
                this.responseFactory
                        .createFailGDataResponse(null),HttpStatus.BAD_REQUEST );
    }

    @ResponseBody
    @ExceptionHandler(value = {UnknownSecurityException.class})
    public ResponseEntity<FailGDataTransfer<?>> userDomainException(UnknownSecurityException userDomainException) {
        log.error(userDomainException.getMessage(), userDomainException);
        return new ResponseEntity<>(
                this.responseFactory
                        .createFailGDataResponse(null),HttpStatus.BAD_REQUEST );
    }

}
