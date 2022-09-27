package az.rock.waffle.ws.domain.applicationService.validator.anno;

import az.rock.waffle.ws.domain.applicationService.validator.constrain.GPasswordConstraint;

import javax.validation.Constraint;
import java.lang.annotation.*;

@Documented
@Constraint(validatedBy = GPasswordConstraint.class)
@Target( { ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
public @interface  GFullName {
}
