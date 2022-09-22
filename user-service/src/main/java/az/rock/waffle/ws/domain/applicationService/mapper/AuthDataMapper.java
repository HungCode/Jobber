package az.rock.waffle.ws.domain.applicationService.mapper;

import az.rock.waffle.ws.domain.applicationService.dto.auth.AuthUserCommand;
import az.rock.waffle.ws.domain.applicationService.dto.auth.AuthUserResponse;
import az.rock.waffle.ws.domain.core.entity.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;
import org.springframework.security.core.Authentication;
@Component
public class AuthDataMapper {
    public AuthUserResponse userToAuthUserResponse(User user){
        return new AuthUserResponse(user.getFirstName(), user.getLastName());
    }


    public AuthUserCommand authenticationToAuthUserResponse(Authentication authentication){
        Object object = authentication.getPrincipal();
        String username = ((UserDetails)object).getUsername();
        String password = ((UserDetails)object).getPassword();
        return new AuthUserCommand(username,password);
    }
}
