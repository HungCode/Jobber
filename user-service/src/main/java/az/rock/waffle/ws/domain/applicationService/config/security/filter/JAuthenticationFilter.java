package az.rock.waffle.ws.domain.applicationService.config.security.filter;

import az.rock.waffle.ws.domain.applicationService.dto.auth.AuthUserCommand;
import az.rock.waffle.ws.domain.applicationService.exception.security.UnknownSecurityException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class JAuthenticationFilter extends UsernamePasswordAuthenticationFilter {
    @Override
    public Authentication attemptAuthentication(HttpServletRequest request, HttpServletResponse response) throws AuthenticationException {

        try {
            AuthUserCommand authUserCommand = new ObjectMapper().readValue(request.getInputStream(),AuthUserCommand.class);
        } catch (IOException e) {
            throw new UnknownSecurityException(e.getMessage());
        }

        return null;
    }
}
