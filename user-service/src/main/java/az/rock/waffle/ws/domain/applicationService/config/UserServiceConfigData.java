package az.rock.waffle.ws.domain.applicationService.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Data
@Configuration
@ConfigurationProperties(prefix = "customer-service")
public class UserServiceConfigData {
    private String userTopicName;
}
