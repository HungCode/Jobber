package az.rock.waffle.ws.domain.applicationService.validator.constrain;

import az.rock.waffle.ws.domain.applicationService.validator.anno.JNullable;
import az.rock.waffle.ws.domain.applicationService.validator.anno.JUnique;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class JUniqueConstraint implements ConstraintValidator<JUnique, String> {
    @Override
    public void initialize(JUnique constraintAnnotation) {
        ConstraintValidator.super.initialize(constraintAnnotation);
    }

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        return false;
    }
}
