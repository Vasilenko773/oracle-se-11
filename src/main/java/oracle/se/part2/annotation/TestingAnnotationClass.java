package oracle.se.part2.annotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

@MyRuntimeAnnotation(
        author = "Bob",
        version = 0.01,
        description = "first annotation"
)
@MyRepeatableAnnotation
@MyRepeatableAnnotation(10)
public class TestingAnnotationClass extends ParentClass implements SomeInterface{

    @MyClassAnnotation
    String myField = "Annotated Field";

    @MySourceAnnotation
    public void printRuntimeAnnotation() {
        Class c = this.getClass();
        showAnnotation(c);
        for (Method method : c.getDeclaredMethods()) {
            showAnnotation(method);
        }
        for (Field field : c.getDeclaredFields()) {
            showAnnotation(field);
        }
    }

    public void showAnnotation(Object e) {
        Annotation[] annotations = null;
        if (e instanceof Class) annotations = ((Class)e).getAnnotations();
        else if (e instanceof Method) {
            annotations = ((Method)e).getAnnotations();
        } else if (e instanceof Field) {
            annotations = ((Field)e).getDeclaredAnnotations();
        }
        for (Annotation annotation : annotations) {
            System.out.println(e.getClass().getSimpleName() + " Annotation: " + annotation);
        }
    }

    public static void main(String[] args) {
        new TestingAnnotationClass().printRuntimeAnnotation();
    }

    @Override
    public void abstractMethod() {

    }

    @Override
    public void interfaceMethod() {

    }
}

@MyFirstInheritedAnnotation
abstract class ParentClass {

    @MyFirstInheritedAnnotation
    public abstract void abstractMethod();
}

@MySecondInheritedAnnotation
interface SomeInterface {
    @MySecondInheritedAnnotation
    void interfaceMethod();
}