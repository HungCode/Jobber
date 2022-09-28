package az.rock.waffle.ws.domain.applicationService.validator.anno;

import az.rock.waffle.ws.domain.applicationService.validator.constrain.JUniqueConstraint;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Documented
@Constraint(validatedBy = JUniqueConstraint.class)
@Target( { ElementType.METHOD })
@Retention(RetentionPolicy.RUNTIME)
public @interface JUnique {
    String message() default "Invalid phone number";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
