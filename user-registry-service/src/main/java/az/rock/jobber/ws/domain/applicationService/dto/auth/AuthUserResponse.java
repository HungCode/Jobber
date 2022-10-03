package az.rock.jobber.ws.domain.applicationService.dto.auth;

import az.rock.jobber.ws.domain.applicationService.dto.Response;
import az.rock.jobber.ws.messenger.transfer.ResponseData;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
@AllArgsConstructor
public class AuthUserResponse implements ResponseData, Response {
    private String name;
    private String lastName;
}