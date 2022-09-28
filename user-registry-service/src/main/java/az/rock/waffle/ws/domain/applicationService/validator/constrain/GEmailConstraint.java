package az.rock.waffle.ws.domain.applicationService.validator.constrain;

import az.rock.waffle.ws.domain.applicationService.validator.anno.GEmail;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class GEmailConstraint  implements ConstraintValidator<GEmail, String> {


    @Override
    public void initialize(GEmail constraintAnnotation) {
        ConstraintValidator.super.initialize(constraintAnnotation);
    }

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {

        return false;
    }
}
