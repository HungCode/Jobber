package az.rock.waffle.ws.domain.applicationService.validator.anno;

import az.rock.waffle.ws.domain.applicationService.validator.constrain.GUsernameConstraint;

import javax.validation.Constraint;
import java.lang.annotation.*;

@Documented
@Constraint(validatedBy = GUsernameConstraint.class)
@Target( { ElementType.METHOD })
@Retention(RetentionPolicy.RUNTIME)
public @interface GUsername {
}
