package az.rock.waffle.ws.domain.applicationService.config.security.filter;

import az.rock.waffle.ws.domain.applicationService.dto.auth.AuthUserCommand;
import az.rock.waffle.ws.domain.applicationService.exception.security.UnknownSecurityException;
import az.rock.waffle.ws.domain.applicationService.exception.security.UserNotFoundSecurityException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

public class JAuthenticationFilter extends UsernamePasswordAuthenticationFilter {
    @Override
    public Authentication attemptAuthentication(HttpServletRequest request, HttpServletResponse response) throws AuthenticationException {
        try {
            AuthUserCommand authUserCommand = new ObjectMapper()
                    .readValue(request.getInputStream(),AuthUserCommand.class);
            return getAuthenticationManager()
                    .authenticate(new UsernamePasswordAuthenticationToken(
                            authUserCommand.username(),
                            authUserCommand.password(),
                            new ArrayList<>()));
        } catch (IOException e) {
            throw new UserNotFoundSecurityException();
        }
    }

    @Override
    protected void successfulAuthentication(HttpServletRequest request, HttpServletResponse response, FilterChain chain, Authentication authResult) throws IOException, ServletException {

    }
}
