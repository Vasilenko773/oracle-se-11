package oracle.se.part2.locale;

import java.text.MessageFormat;
import java.util.Date;
import java.util.Locale;
import java.util.ResourceBundle;

public class LocaleFormattingText {

    public static void main(String[] args) {
        Date now = new Date();

        Locale.setDefault(new Locale("en", "AU"));
        Locale.setDefault(Locale.US);

        float floatValue = 10.233f;
        Locale[] locales = {new Locale("en", "AU"), Locale.FRANCE, Locale.US, Locale.ITALY};

        for (Locale l : locales) {
            System.out.println("---------------" + l + "--------------");
            Locale.setDefault(l);

            String someText = ResourceBundle.getBundle("firstBundle").getString("unsure");
            System.out.println("NOT LOCALIZED : " + someText + " : " + floatValue + " : " + now);
            System.out.format("LOCALIZED 1 : %s : %f : %tF : %n", someText, floatValue, now);
            System.out.println(String.format("LOCALIZED 2 : %2$s : %1$.2f : %3$tA %3$tB %3$td, %3$tC", floatValue, someText, now));
            System.out.println(MessageFormat.format("LOCALIZED 3 : {0} : {1} : {2}", someText, floatValue, now));
            System.out.println(MessageFormat.format("LOCALIZED 4 : {0} : {1, number, currency} : {2, date, short}", someText, floatValue, now));
        new Date();
        }
    }
}
