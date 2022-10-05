package az.rock.jobber.ws.domain.application.validator.constrain;

import az.rock.jobber.ws.domain.application.validator.anno.GUserType;
import az.rock.jobber.ws.valueObject.UserType;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class GUserTypeConstraint implements ConstraintValidator<GUserType, UserType> {
    @Override
    public void initialize(GUserType constraintAnnotation) {
        ConstraintValidator.super.initialize(constraintAnnotation);
    }

    @Override
    public boolean isValid(UserType value, ConstraintValidatorContext context) {
        return true;
    }
}
