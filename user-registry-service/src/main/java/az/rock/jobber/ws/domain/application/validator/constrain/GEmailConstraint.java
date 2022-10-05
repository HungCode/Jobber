package az.rock.jobber.ws.domain.application.validator.constrain;

import az.rock.jobber.ws.domain.application.validator.anno.GEmail;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class GEmailConstraint  implements ConstraintValidator<GEmail, String> {


    @Override
    public void initialize(GEmail constraintAnnotation) {
        ConstraintValidator.super.initialize(constraintAnnotation);
    }

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {

        return true;
    }
}
