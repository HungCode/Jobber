package az.rock.waffle.ws.security;

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

    public static class Config{

    }

    @Override
    public GatewayFilter apply(Config config) {
        return ((exchange, chain) -> {
            ServerHttpRequest serverHttpRequest = exchange.getRequest();
            if(!serverHttpRequest.getHeaders().containsKey(HttpHeaders.AUTHORIZATION)){
                return fail(exchange,"No authorization header", HttpStatus.UNAUTHORIZED);
            }
            String token = Objects.requireNonNull(serverHttpRequest.getHeaders().get(HttpHeaders.AUTHORIZATION)).get(0).replace("Bearer","");

            return chain.filter(exchange);
        });
    }

    private Mono<Void> fail(ServerWebExchange serverWebExchange,String message,HttpStatus httpStatus){
        ServerHttpResponse serverHttpResponse = serverWebExchange.getResponse();
        serverHttpResponse.setStatusCode(httpStatus);
        return serverHttpResponse.setComplete();
    }
}
