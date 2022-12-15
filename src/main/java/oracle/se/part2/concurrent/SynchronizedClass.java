package oracle.se.part2.concurrent;

import lombok.ToString;

import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.TreeMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@ToString
class TheBallInTheAir {
    private String bellType = "Volleyball";
    private int hit;
    private Map<String, Integer> players = new TreeMap<>();

    public int addHit(String player) {
        this.hit++;
        if (players.containsKey(player)) {
            players.computeIfPresent(player, (k,v) -> ++v);
        } else {
            players.put(player, 1);
        }
        return this.hit;
    }

}

public class SynchronizedClass {

    public static TheBallInTheAir shareBall = new TheBallInTheAir();

    public static void main(String[] args) throws InterruptedException {
        String[] players = {"Jane", "Mary", "Ralph", "Joe"};
        Random r = new Random();

        List<String> playerTurns = Stream.generate(() -> players[r.nextInt(4)])
                .limit(100)
                .collect(Collectors.toList());

        ExecutorService executorService = null;
        try {
            executorService = Executors.newFixedThreadPool(5);
            for (String player : playerTurns) {
                executorService.submit(() -> shareBall.addHit(player));
            }
        } finally {
            if (executorService != null) {
                executorService.shutdown();
                try {
                    executorService.awaitTermination(1, TimeUnit.SECONDS);
                    System.out.println(shareBall);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        }
    }
}
