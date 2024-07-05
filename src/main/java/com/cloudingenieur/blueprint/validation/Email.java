package com.cloudingenieur.blueprint.validation;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.*;

@Constraint(validatedBy = EmailValidator.class)
@Target({ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Email {
    String message() default "Must contain abc@domainname.com.";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
