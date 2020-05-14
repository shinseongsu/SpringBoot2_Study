package com.sample.web.admin.controller.html.Annotation;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Documented
@Constraint(validatedBy = { ContentTypeValidator.class })
@Target({ ElementType.METHOD, ElementType.FIELD })
@Retention(RUNTIME)
public @interface ContentType {

    String message() default "{validator.annotation.ContentType.message}";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};

    String[] allowed() default {};

    String[] rejected() default {};

    @Target({ FIELD })
    @Retention(RUNTIME)
    @Documented
    public @interface List {
        ContentType[] value();
    }
}
