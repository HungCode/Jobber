package az.rock.jobber.ws.messenger.response.wrapper;

import az.rock.jobber.ws.exception.GRuntimeException;
import az.rock.jobber.ws.messenger.response.GDataResponse;

import java.util.Objects;
import java.util.function.Consumer;

public final class GDataWrapper <R extends GDataResponse<B>,B>{
    private GRuntimeException exception = new GRuntimeException();
    private Consumer<B> consumer = (responseBody)->{};
    private final R response;
    private final B responseBody;


    public GDataWrapper(R response){
        this.response = response;
        this.responseBody = response.getData();
    }

    public GDataWrapper(R response, Consumer<B> consumer){
        this(response);
        this.consumer = consumer;
    }

    public GDataWrapper(R response, GRuntimeException exception){
        this(response);
        this.exception = exception;
    }

    public B getBody() {
        if (!this.response.getSuccess() || Objects.isNull(this.responseBody))
            throw this.exception;
        this.consumer.accept(responseBody);
        return this.responseBody;
    }
}
