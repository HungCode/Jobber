package az.rock.jobber.ws.domain.applicationService.anno;

import org.springframework.stereotype.Component;

import java.lang.annotation.*;

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Component
public @interface FallbackFactory {
    String value() default "";
}
