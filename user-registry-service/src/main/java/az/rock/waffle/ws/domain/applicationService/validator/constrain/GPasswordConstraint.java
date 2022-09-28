package az.rock.waffle.ws.domain.applicationService.validator.constrain;

import az.rock.waffle.ws.domain.applicationService.validator.anno.GPassword;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class GPasswordConstraint  implements ConstraintValidator<GPassword, String> {


    @Override
    public void initialize(GPassword constraintAnnotation) {
        ConstraintValidator.super.initialize(constraintAnnotation);
    }

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        return true;
    }
}

