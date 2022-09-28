package az.rock.waffle.ws;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class ConfigApplicationService {
    public static void main(String[] args) {
        SpringApplication.run(ConfigApplicationService.class,args); 
    }
}