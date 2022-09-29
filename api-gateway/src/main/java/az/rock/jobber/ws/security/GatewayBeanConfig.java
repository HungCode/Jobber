package az.rock.jobber.ws.security;

import az.rock.jobber.ws.response.ResponseData;
import az.rock.jobber.ws.response.fail.FailGResponseFactory;
import az.rock.jobber.ws.response.factory.AbstractFailGResponseFactory;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GatewayBeanConfig {

    @Bean
    public AbstractFailGResponseFactory<ResponseData> abstractFailGResponseFactory(){
        return new FailGResponseFactory<>();
    }


    @Bean
    public RouteLocator routeLocator(RouteLocatorBuilder routeLocatorBuilder, JAuthorizationHeaderFilter
            authorizationHeaderFilter) {

        return routeLocatorBuilder
                .routes()
                .route(p -> p
                        .path("/user-service/users/profile/**")
                        .filters(f -> f.removeRequestHeader("Cookie")
                                .rewritePath("/user-service/(?<segment>.*)", "/$\\{segment}")
                                .filter(authorizationHeaderFilter.apply(new
                                        JAuthorizationHeaderFilter.Config())))
                        .uri("lb://user-service")
                )
                .build();
    }
}
