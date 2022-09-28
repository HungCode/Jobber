package az.rock.waffle.ws.domain.applicationService.mapper;

import az.rock.waffle.ws.domain.applicationService.dto.auth.AuthUserCommand;
import az.rock.waffle.ws.domain.applicationService.dto.auth.AuthUserResponse;
import az.rock.waffle.ws.domain.core.aggregate.UserRoot;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;
import org.springframework.security.core.Authentication;
@Component
public class AuthDataMapper {
    public AuthUserResponse userToAuthUserResponse(UserRoot userRoot){
        return new AuthUserResponse(userRoot.getFirstName(), userRoot.getLastName());
    }


    public AuthUserCommand authenticationToAuthUserResponse(Authentication authentication){
        Object object = authentication.getPrincipal();
        String username = ((UserDetails)object).getUsername();
        String password = ((UserDetails)object).getPassword();
        return new AuthUserCommand(username,password);
    }
}
