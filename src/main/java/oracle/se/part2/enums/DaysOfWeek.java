package oracle.se.part2.enums;

public enum DaysOfWeek {
    sunday, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
}

class TestDayOfWeek {
    public static void main(String[] args) {
        for (DaysOfWeek day : DaysOfWeek.values()) {
            System.out.println(day.ordinal() +" is " + day);
            switch (day) {
                case MONDAY:
                case TUESDAY:
                    System.out.println("long road ahead");
                    break;
                case WEDNESDAY:
                    System.out.println("Hump day");
                    break;
                case THURSDAY:
            }
        }

        System.out.println(DaysOfWeek.valueOf("WEDNESDAY"));

        System.out.println("__________");

    }
}





