package oracle.se.part2.locale;

import java.util.Locale;
import java.util.ResourceBundle;

public class LocaleResources {
    public static void main(String[] args) {
        Locale.setDefault(new Locale("en", "AU"));
        testProperties(Locale.getDefault());
    }

    public static void testProperties(Locale locale) {
        ResourceBundle bundle = ResourceBundle. getBundle("firstBundle", locale);
        System.out.println(bundle.getClass().getName());
        System.out.println(bundle.getLocale());
        System.out.println(bundle.getString("yes") + " " + locale);
        bundle.keySet().forEach(s -> System.out.println(bundle.getObject(s)));

    }
}
