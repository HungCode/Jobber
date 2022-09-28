package az.rock.waffle.ws.domain.applicationService.validator.constrain;

import az.rock.waffle.ws.domain.applicationService.validator.anno.GUserType;
import az.rock.waffle.ws.valueObject.UserType;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class GUserTypeConstraint implements ConstraintValidator<GUserType, UserType> {
    @Override
    public void initialize(GUserType constraintAnnotation) {
        ConstraintValidator.super.initialize(constraintAnnotation);
    }

    @Override
    public boolean isValid(UserType value, ConstraintValidatorContext context) {
        return false;
    }
}
