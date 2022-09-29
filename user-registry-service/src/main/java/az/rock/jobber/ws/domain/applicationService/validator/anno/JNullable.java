package az.rock.jobber.ws.domain.applicationService.validator.anno;

import az.rock.jobber.ws.domain.applicationService.validator.constrain.JNullableConstraint;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Documented
@Constraint(validatedBy = JNullableConstraint.class)
@Target( { ElementType.METHOD })
@Retention(RetentionPolicy.RUNTIME)
public @interface JNullable {
    String message() default "Invalid phone number";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
