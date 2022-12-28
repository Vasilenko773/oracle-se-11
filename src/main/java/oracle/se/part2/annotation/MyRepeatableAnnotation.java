package oracle.se.part2.annotation;

import java.lang.annotation.Repeatable;

@Repeatable(MyRepeatableAnnotations.class)
public @interface MyRepeatableAnnotation {

    int value() default 0;
}
