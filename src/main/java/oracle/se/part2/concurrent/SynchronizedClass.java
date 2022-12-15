package oracle.se.part2.concurrent;

import lombok.ToString;

import java.util.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;
import java.util.stream.Stream;


class TheBallInTheAir {

    private String bellType = "Volleyball";
    private AtomicInteger hit = new AtomicInteger(0);
    private Map<String, Integer> players = Collections.synchronizedMap(new TreeMap<>());

    public int addHit(String player) {
            if (players.containsKey(player)) {
                players.computeIfPresent(player, (k, v) -> ++v);
            } else {
                players.put(player, 1);
            }

        return hit.incrementAndGet();
    }

    @Override
    public String toString() {
        return "TheBallInTheAir{" +
                "bellType='" + bellType + '\'' +
                ", hit=" + this.hit.get() +" playres = " + players.values().stream().mapToInt(s -> s).sum() +
                ", players=" + players + " " +
                '}';
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
