package az.rock.waffle.ws.domain.applicationService.exception.security;

import az.rock.waffle.ws.domain.applicationService.ports.input.service.abst.AuthService;
import az.rock.waffle.ws.domain.applicationService.ports.output.repository.AbstractUserRepository;
import az.rock.waffle.ws.domain.core.entity.User;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Objects;

@Component
@RequiredArgsConstructor
public class GUserDetailsService implements UserDetailsService {
    private final AuthService authService;
    private final PasswordEncoder passwordEncoder;
    private final AbstractUserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = this.userRepository.findByUsername(username);
        if(Objects.isNull(user)) throw new UserNotFoundSecurityException();

        return new org.springframework.security.core.userdetails.User(
                user.getUsername(),user.getPassword(),
                true,true,
                true,true,new ArrayList<>());
    }

}
