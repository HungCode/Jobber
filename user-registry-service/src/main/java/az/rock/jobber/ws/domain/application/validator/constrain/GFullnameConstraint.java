package az.rock.jobber.ws.domain.application.validator.constrain;

import az.rock.jobber.ws.domain.application.validator.anno.GFullName;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class GFullnameConstraint implements ConstraintValidator<GFullName,String> {
    @Override
    public void initialize(GFullName constraintAnnotation) {
        ConstraintValidator.super.initialize(constraintAnnotation);
    }

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        return true;
    }
}
