package az.rock.waffle.ws;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@EnableEurekaServer
@PropertySource(value = "classpath:discovery-application.properties")
public class DiscoveryService {
    public static void main(String[] args) {
        SpringApplication.run(DiscoveryService.class, args);
    }
}