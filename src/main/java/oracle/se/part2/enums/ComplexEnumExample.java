package oracle.se.part2.enums;

enum WeeksDays {
    SUNDAY("Sun", "Wonderful Weekend"),
    MONDAY("Mon", "Long road ahead"),
    TUESDAY("Tues", "Long road ahead"),
    WEDNESDAY("Wed", "Hump day"),
    THURSDAY("Thurs", "TGIF - 1"),
    SATURDAY("Sat", "Wonderful Weekend");
    String abbreviation;
    String description = "TGIF";

    WeeksDays(String abbreviation) {
        this.abbreviation = abbreviation;
    }

    WeeksDays(String abbreviation, String description) {
        this.abbreviation = abbreviation;
        this.description = description;
    }

    public String printType() {
        if (this == SATURDAY || this == SUNDAY) return "Weekend";
        return "Weekday";
    }
}

public class ComplexEnumExample {

    public static void main(String[] args) {
        for (WeeksDays day : WeeksDays.values()) {
            System.out.println(day.ordinal() + " is " + day.abbreviation + " : " + day.description);
        }
        System.out.println("________");
        System.out.println(WeeksDays.SATURDAY + " is a " + WeeksDays.SATURDAY.printType());
    }

}
