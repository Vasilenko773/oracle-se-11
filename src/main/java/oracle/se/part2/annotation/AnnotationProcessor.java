package oracle.se.part2.annotation;

import javax.annotation.processing.AbstractProcessor;
import javax.annotation.processing.RoundEnvironment;
import javax.annotation.processing.SupportedAnnotationTypes;
import javax.annotation.processing.SupportedSourceVersion;
import javax.lang.model.SourceVersion;
import javax.lang.model.element.Element;
import javax.lang.model.element.TypeElement;
import java.util.Set;

@SupportedAnnotationTypes(
        {
                "oracle.se.part2.annotation.MyClassAnnotation",
                "oracle.se.part2.annotation.MyRuntimeAnnotation",
                "oracle.se.part2.annotation.MySourceAnnotation",
        }
)
@SupportedSourceVersion(SourceVersion.RELEASE_11)
public class AnnotationProcessor extends AbstractProcessor {
    @Override
    public boolean process(Set<? extends TypeElement> annotations, RoundEnvironment roundEnv) {
        for (TypeElement annotation : annotations) {
            for (Element element : roundEnv.getElementsAnnotatedWith(annotation)) {
                System.out.println(
                        element.getKind() + " " + element.getEnclosingElement() + "." + element + " is annotated with " + annotation
                );
            }
        }
        return true;
    }
}
