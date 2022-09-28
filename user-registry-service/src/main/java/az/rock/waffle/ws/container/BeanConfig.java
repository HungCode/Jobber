package az.rock.waffle.ws.container;

import az.rock.waffle.ws.response.ResponseData;
import az.rock.waffle.ws.response.factory.AbstractFailGResponseFactory;
import az.rock.waffle.ws.response.factory.AbstractSuccessGResponseFactory;
import az.rock.waffle.ws.response.fail.FailGResponseFactory;
import az.rock.waffle.ws.response.success.SuccessGResponseFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
public class BeanConfig {

    @Bean
    public PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }

    @Bean
    public AbstractSuccessGResponseFactory<ResponseData> abstractSuccessGResponseFactory(){
        return new SuccessGResponseFactory<>();
    }

    @Bean
    public AbstractFailGResponseFactory<ResponseData> abstractFailGResponseFactory(){
        return new FailGResponseFactory<>();
    }
}