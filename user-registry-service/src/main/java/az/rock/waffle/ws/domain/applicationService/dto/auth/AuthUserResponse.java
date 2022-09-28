package az.rock.waffle.ws.domain.applicationService.dto.auth;

import az.rock.waffle.ws.domain.applicationService.dto.Response;
import az.rock.waffle.ws.response.ResponseData;
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