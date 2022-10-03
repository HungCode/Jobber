package az.rock.jobber.ws.messenger.response.wrapper;

import az.rock.jobber.ws.exception.GException;
import az.rock.jobber.ws.exception.GRuntimeException;
import az.rock.jobber.ws.messenger.response.GDataResponse;

import java.util.Objects;

public class GDataWrapper <R extends GDataResponse<B>,B>{
    private GRuntimeException exception;
    private final R response;
    private final B responseBody;

    public GDataWrapper(R response){
        this.exception = new GRuntimeException();
        this.response = response;
        this.responseBody = response.getData();
    }

    public GDataWrapper(R response, GRuntimeException exception){
        this(response);
        this.exception = exception;
    }

    public B getBody() {
        if (!this.response.getSuccess() || Objects.isNull(this.responseBody))
            throw this.exception;
        return this.responseBody;
    }

}
