package az.rock.waffle.ws.domain.applicationService.exception.security;

import az.rock.waffle.ws.domain.applicationService.dto.auth.AuthUserCommand;
import az.rock.waffle.ws.domain.applicationService.mapper.AuthDataMapper;
import az.rock.waffle.ws.domain.applicationService.ports.output.repository.AbstractUserRepository;
import az.rock.waffle.ws.domain.core.entity.User;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;
import org.springframework.security.core.Authentication;
import java.util.ArrayList;
import java.util.Objects;

@Component
@RequiredArgsConstructor
@Getter
public class GUserDetailsService implements UserDetailsService {

    private final AuthDataMapper authDataMapper;
    private final PasswordEncoder passwordEncoder;
    private final AbstractUserRepository userRepository;

    @Value(value = "${rock.security-key}")
    private String securityKey;

    @Value(value = "${rock.token-exp-time}")
    private String tokenExpDate;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = this.userRepository.findByUsername(username);
        if(Objects.isNull(user)) throw new UserNotFoundSecurityException();

        return new org.springframework.security.core.userdetails.User(
                user.getUsername(),user.getPassword(),
                true,true,
                true,true,new ArrayList<>());
    }

    public UserDetails getUserDetailsByUserName(String userName){
        UserDetails userDetails = this.loadUserByUsername(userName);
        if(Objects.isNull(userDetails)) throw new UserNotFoundSecurityException();
        return userDetails;
    }

    public User matches(Authentication authentication){
        String username = ((UserDetails)authentication.getPrincipal()).getUsername();
        return this.userRepository.findByUsername(username);
    }
}
