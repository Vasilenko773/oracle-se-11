package oracle.se.part2.enums;

public enum PinochleMeld {

    PINOCHLE(4) {
        @Override
        public void describe() {
            System.out.println("PINOCHLE");
        }
    },
    MARRIAGE(2) {
        int adjustScore() {
            return 2;
        }
        @Override
        public void describe() {
            System.out.println("MARRIAGE");
        }
    },
    NINE_OF_TRUMP(1) {
        @Override
        public void describe() {
            System.out.println("NINE_OF_TRUMP");
        }
    };

    protected int score;
    PinochleMeld(int score) {
        this.score = score;
    }

    int adjustScore() {
        return 0;
    }

    public abstract void describe();
}

class PinochleGame {
    public static void main(String[] args) {
        int count = 0;
        PinochleMeld[] hand = {
                PinochleMeld.PINOCHLE,
                PinochleMeld.MARRIAGE,
                PinochleMeld.NINE_OF_TRUMP
        };

        for (PinochleMeld point : hand) {
            point.describe();
            count += point.adjustScore();
        }
        System.out.println(count);
    }
}
