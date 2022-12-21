package oracle.se.part2.io;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;


public class PathMethods {

    public static void main(String[] args) throws IOException {
        Path b2 = Path.of("characterData.txt");
        Files.write(b2, "Extra secret\n".getBytes(), StandardOpenOption.WRITE);
        Files.writeString(b2, "Secret Ingredient Three\n", StandardOpenOption.APPEND);
      //  Files.writeString(b2, "Secret Ingridient Two\n", StandardOpenOption.DELETE_ON_CLOSE);



    }


}


