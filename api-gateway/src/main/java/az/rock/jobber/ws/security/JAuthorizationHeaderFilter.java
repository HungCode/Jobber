package az.rock.jobber.ws.security;

import az.rock.jobber.ws.exception.GAuthenticationException;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.MalformedJwtException;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.gateway.filter.GatewayFilter;
import org.springframework.cloud.gateway.filter.factory.AbstractGatewayFilterFactory;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.server.reactive.ServerHttpRequest;
import org.springframework.http.server.reactive.ServerHttpResponse;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

import java.util.Objects;

@Component
public class JAuthorizationHeaderFilter extends AbstractGatewayFilterFactory<JAuthorizationHeaderFilter.Config> {

    @Value(value = "${rock.security-key}")
    private String tokenKey;

    public JAuthorizationHeaderFilter(){
        super(Config.class);
    }
    public static class Config{

    }
    @Override
    public GatewayFilter apply(Config config) {
        return ((exchange, chain) -> {
            ServerHttpRequest serverHttpRequest = exchange.getRequest();
            if(!serverHttpRequest.getHeaders().containsKey(HttpHeaders.AUTHORIZATION))
                return fail(exchange,"No authorization header", HttpStatus.UNAUTHORIZED);

            String token = Objects.requireNonNull(serverHttpRequest.getHeaders().get(HttpHeaders.AUTHORIZATION)).get(0).replace("Bearer","");
            if (!this.isValidToken(token))
                return fail(exchange,"Token is not Valid!", HttpStatus.UNAUTHORIZED);

            return chain.filter(exchange);
        });
    }

    private Mono<Void> fail(ServerWebExchange serverWebExchange,String message,HttpStatus httpStatus){
        ServerHttpResponse serverHttpResponse = serverWebExchange.getResponse();
        serverHttpResponse.setStatusCode(httpStatus);
        return serverHttpResponse.setComplete();
    }

    private boolean isValidToken(String token){
        String subject = "";
        try {
            subject = Jwts.parser()
                    .setSigningKey(this.tokenKey)
                    .parseClaimsJws(token)
                    .getBody()
                    .getSubject();
        }catch (MalformedJwtException malformedJwtException){
            throw new GAuthenticationException();
        }

        return Objects.nonNull(subject) || subject.isEmpty();
    }
}
