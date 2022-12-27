package oracle.se.part2.locale;

import java.util.ListResourceBundle;

public class firstBundle extends ListResourceBundle {
    @Override
    protected Object[][] getContents() {
        return new Object[][] {
                {"yes", "Yea"},
                {"no", "Nah"},
                {"unsure", "Not sure"}
        };
    }
}
