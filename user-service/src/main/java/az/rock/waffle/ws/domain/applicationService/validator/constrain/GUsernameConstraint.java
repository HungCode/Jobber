package az.rock.waffle.ws.domain.applicationService.validator.constrain;

import az.rock.waffle.ws.domain.applicationService.validator.anno.GUsername;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class GUsernameConstraint implements ConstraintValidator<GUsername, String> {


    @Override
    public void initialize(GUsername constraintAnnotation) {
        ConstraintValidator.super.initialize(constraintAnnotation);
    }

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        return false;
    }
}
