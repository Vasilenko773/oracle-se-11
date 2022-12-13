package oracle.se.part2.stream.optional;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

@Data
@AllArgsConstructor
@NoArgsConstructor
class Person {

    private String name;
    private Optional<Integer> age = Optional.empty();

    public Person(String name) {
        this.name = name;
    }
}

public class OptionalOrElse {

    public static void main(String[] args) {

      List.of(new Person("Bob", Optional.of(17)), new Person("Keyn")).stream()
                .allMatch(i -> i.getName().length() > 3);



    }

    public static Integer get() {
        System.out.println("Вызов метода гет");
        return 1;
    }
}
