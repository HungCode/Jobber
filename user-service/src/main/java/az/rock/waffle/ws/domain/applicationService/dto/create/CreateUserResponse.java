package az.rock.waffle.ws.domain.applicationService.dto.create;

import az.rock.waffle.ws.domain.applicationService.dto.Response;
import az.rock.waffle.ws.response.ResponseData;
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