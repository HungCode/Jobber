package az.rock.jobber.ws.spec.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface GPost {
    Method method() default Method.POST;
    String api() default "/";
    String desc() default "";
}
