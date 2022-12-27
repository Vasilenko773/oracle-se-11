package oracle.se.part2.locale;

import java.util.Arrays;
import java.util.Locale;

public class LocaleReview {

    public static void main(String[] args) {
        System.out.println("Number of locales" + Locale.getAvailableLocales().length);

        System.out.println("------Hong Kong Locales ------");
        Arrays.stream(Locale.getAvailableLocales())
                .filter((s) -> s.getCountry().equals("HK"))
                .forEach((s) -> System.out.println(s + " : " + s.getDisplayName()));
        System.out.println("------Language only---------");
        Arrays.stream(Locale.getAvailableLocales())
                .filter(s -> s.getCountry().length() == 0 && s.getLanguage().length() > 5)
                .limit(7)
                .forEach(s -> System.out.println(s + " : " + s.getDisplayName()));
        System.out.println("------Locales with variants---------");
        Arrays.stream(Locale.getAvailableLocales())
                .filter(s -> s.getVariant().length() > 0)
                .forEach(s -> System.out.println(s.getDisplayName() + " : " + s.getVariant()));
        System.out.println("Default locale " + Locale.getDefault());
        System.out.println("Default locale " + Locale.getDefault().getDisplayName());
        System.out.println(Locale.getDefault().getDisplayName(Locale.CHINA));
    }
}
