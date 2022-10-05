package az.rock.jobber.ws.domain.application.validator.constrain;

import az.rock.jobber.ws.domain.application.validator.anno.JNullable;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class JNullableConstraint implements ConstraintValidator<JNullable, String> {


    @Override
    public void initialize(JNullable constraintAnnotation) {
        ConstraintValidator.super.initialize(constraintAnnotation);
    }

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        return true;
    }
}
