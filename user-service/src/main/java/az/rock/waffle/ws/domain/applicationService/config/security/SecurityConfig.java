package az.rock.waffle.ws.domain.applicationService.config.security;

import az.rock.waffle.ws.domain.applicationService.config.security.filter.JAuthenticationFilter;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.AuthenticationConverter;
import org.springframework.security.web.authentication.AuthenticationFilter;
import org.springframework.security.web.authentication.www.BasicAuthenticationConverter;

import javax.servlet.Filter;
import javax.servlet.http.HttpServletRequest;

@Configuration
@EnableWebSecurity
@PropertySource("classpath:application.properties")
public class SecurityConfig extends WebSecurityConfigurerAdapter {


    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.csrf().disable();
        http.authorizeRequests().antMatchers("/**").hasIpAddress("127.0.0.1")
                .and()
                .addFilter(this.getAuthenticationFilter());
        http.headers().frameOptions().disable();
    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        super.configure(auth);
    }

    private JAuthenticationFilter getAuthenticationFilter() throws Exception {
        JAuthenticationFilter jAuthenticationFilter = new JAuthenticationFilter();
        jAuthenticationFilter.setAuthenticationManager(authenticationManager());
        return jAuthenticationFilter;
    }
}
