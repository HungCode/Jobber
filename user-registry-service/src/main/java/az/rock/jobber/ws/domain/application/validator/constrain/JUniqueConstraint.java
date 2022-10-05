package az.rock.jobber.ws.domain.application.validator.constrain;

import az.rock.jobber.ws.domain.application.validator.anno.JUnique;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class JUniqueConstraint implements ConstraintValidator<JUnique, String> {
    @Override
    public void initialize(JUnique constraintAnnotation) {
        ConstraintValidator.super.initialize(constraintAnnotation);
    }

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        return true;
    }
}
