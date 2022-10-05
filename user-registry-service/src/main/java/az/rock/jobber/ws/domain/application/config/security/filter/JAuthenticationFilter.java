package az.rock.jobber.ws.domain.application.config.security.filter;

import az.rock.jobber.ws.domain.application.exception.security.GUserDetailsService;
import az.rock.jobber.ws.domain.application.exception.security.UserNotFoundSecurityException;
import az.rock.jobber.ws.domain.application.dto.auth.AuthUserCommand;
import az.rock.jobber.ws.domain.core.aggregate.UserRoot;
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
import java.util.HashMap;
import java.util.Map;

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
            throw new UserNotFoundSecurityException("Istifadəçi tapılmadı");
        }
    }

    @Override
    protected void successfulAuthentication(HttpServletRequest request, HttpServletResponse response,
                                            FilterChain chain, Authentication authResult) throws IOException, ServletException {
        UserRoot userRoot = this.gUserDetailsService.matches(authResult);
        Map<String,Object> claims = new HashMap<>();
        claims.put("user",userRoot.getUserType().toString());
        String token = Jwts.builder()
                .setSubject(userRoot.getFinIdentify().toString())
                .setExpiration(new Date(System.currentTimeMillis() + Long.parseLong(this.gUserDetailsService.getTokenExpDate())))
                .signWith(SignatureAlgorithm.HS512,this.gUserDetailsService.getSecurityKey())
                .setClaims(claims)
                .compact();
        response.addHeader("Token",token);
        response.addHeader("ID", userRoot.getId().toString());
    }
}
