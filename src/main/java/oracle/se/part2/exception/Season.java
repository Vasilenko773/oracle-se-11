package oracle.se.part2.exception;

import java.io.Closeable;
import java.io.IOException;

public class Season implements AutoCloseable {

    private int seasonNumber;

    public Season(int seasonNumber) {
        this.seasonNumber = seasonNumber;
    }

    public class Episode implements AutoCloseable {
        private int episodeNumber;

        public Episode(int episodeNumber) {
            this.episodeNumber = episodeNumber;
        }

        @Override
        public void close() throws Exception {
            System.out.println("Close methode start in Episode Class");
            if (this.episodeNumber == 1) throw new RuntimeException("Closing Failed on Episode");
            System.out.println("Close methode end in Episode Class");
        }

        public void run() {
            System.out.println("Running episode " + this.episodeNumber);
            if (this.episodeNumber == 1) {
                throw new RuntimeException("Episode failed");
            }
        }
    }

    @Override
    public void close() throws Exception {
        System.out.println("Close methode start in Season Class");
        if (this.seasonNumber == 1) throw new RuntimeException("Closing Failed on Season");
        System.out.println("Close methode end in Season Class");
    }

    public void run() {
        System.out.println("Running season " + this.seasonNumber);
        if (this.seasonNumber == 1) {
            throw new RuntimeException("Season failed");
        }
    }

    public static void main(String[] args) {
        Throwable addedSuppressed = null;
        try (
                Season s = new Season(1);
                Season.Episode e = s.new Episode(1)) {
            try {
                s.run();

            } catch (Exception ex) {
                addedSuppressed = ex;
            }
            e.run();
        } catch (Exception e) {
            System.out.println(e);
            if (addedSuppressed != null) {
                e.addSuppressed(addedSuppressed);
            }

            for (Throwable t : e.getSuppressed()) {
                System.out.println(t);
            }
        }
    }
}

