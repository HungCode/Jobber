package az.rock.waffle.ws.security;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GatewayBeanConfig {
    @Bean
    public RouteLocator routeLocator(RouteLocatorBuilder rlb, JAuthorizationHeaderFilter
            authorizationHeaderFilter) {

        return rlb
                .routes()
                .route(p -> p
                        .path("/user-service/users/get/apply")
                        .filters(f -> f.removeRequestHeader("Cookie")
                                .rewritePath("/user-service/(?<segment>.*)", "/$\\{segment}")
                                .filter(authorizationHeaderFilter.apply(new
                                        JAuthorizationHeaderFilter.Config())))
                        .uri("lb://user-service")
                )
                .build();
    }
}
