package az.rock.jobber.ws.domain.application.dto.create;

import az.rock.jobber.ws.domain.application.dto.Response;
import az.rock.jobber.ws.messenger.transfer.ResponseData;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

import javax.validation.constraints.NotNull;
import java.util.UUID;

@Getter
@Builder
@AllArgsConstructor
public class CreateUserResponse implements ResponseData, Response {
    @NotNull
    private final UUID customerId;
    @NotNull
    private final String message;
}
