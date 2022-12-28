package oracle.se.part2.annotation;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Documented
public @interface MyRuntimeAnnotation {

    String author();
    double version();
    String description();
}
