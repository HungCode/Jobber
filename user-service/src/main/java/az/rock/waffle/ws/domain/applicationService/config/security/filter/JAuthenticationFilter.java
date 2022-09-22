package az.rock.waffle.ws.domain.applicationService.config.security.filter;

import az.rock.waffle.ws.domain.applicationService.dto.auth.AuthUserCommand;
import az.rock.waffle.ws.domain.applicationService.exception.security.GUserDetailsService;
import az.rock.waffle.ws.domain.applicationService.exception.security.UserNotFoundSecurityException;
import az.rock.waffle.ws.domain.applicationService.mapper.AuthDataMapper;
import az.rock.waffle.ws.domain.core.entity.User;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.security.authentication.AuthenticationManager;
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
import java.util.Date;

public class JAuthenticationFilter extends UsernamePasswordAuthenticationFilter {

    private final GUserDetailsService gUserDetailsService;

    public JAuthenticationFilter(GUserDetailsService authService,AuthenticationManager authenticationManager) {
        this.gUserDetailsService = authService;
        super.setAuthenticationManager(authenticationManager);
    }

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
    protected void successfulAuthentication(HttpServletRequest request, HttpServletResponse response,
                                            FilterChain chain, Authentication authResult) throws IOException, ServletException {
        User user = this.gUserDetailsService.matches(authResult);
        String token = Jwts.builder()
                .setSubject(user.getUsername())
                .setExpiration(new Date(System.currentTimeMillis() + Long.parseLong(this.gUserDetailsService.getTokenExpDate())))
                .signWith(SignatureAlgorithm.HS512,this.gUserDetailsService.getSecurityKey())
                .compact();
        response.addHeader("token",token);
        response.addHeader("uuid",user.getUsername());
    }
}
