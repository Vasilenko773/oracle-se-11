package oracle.se.part2.exception;

public class SeasonTest {

    public static void main(String[] args) {

        try (Season s = new Season(1)) {
            for (int i = 0; i < 2; i++) {
                try (s;
                     Season.Episode e = s.new Episode(i)) {
                    e.run();
                } catch (Exception e) {
                    e.printStackTrace(System.out);
                }
            }
        }
    }
}
