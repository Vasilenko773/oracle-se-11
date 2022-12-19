package oracle.se.part2.concurrent;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
class Chat {
    private Participant participant;

    public synchronized void setParticipant(Participant p) {
        participant = p;
    }
}

@AllArgsConstructor
@Data
class Participant {
    private String name;
    private boolean iterated = true;
    private boolean mustHaveLAstWorld;
    public Participant(String name, boolean mustHaveLAstWorld) {
        this.name = name;
        this.mustHaveLAstWorld = mustHaveLAstWorld;
    }



    public synchronized void converse(Chat chat, Participant respons) {
        while (isIterated()) {
            if (chat.getParticipant() != this) {
                try {
                    wait(250);
                } catch (InterruptedException e) {
                    throw new RuntimeException("Something interrupted");
                }
                continue;
            }
            System.out.println(getName() + " " + respons.getName());
            chat.setParticipant(respons);
            this.iterated = mustHaveLAstWorld;
        }
        System.out.println(getName() + " you later " + respons.getName());
        respons.setIterated(false);
    }
}

public class LivelockExample {

    public static void main(String[] args) {
        Participant p1 = new Participant("Chaty", true);
        Participant p2 = new Participant("Will", false);
        Chat frustratinigConversion = new Chat(p1);

        Thread cathy = new Thread(() -> p1.converse(frustratinigConversion, p2));
        Thread will = new Thread(new Thread(() -> p2.converse(frustratinigConversion, p1)));
        cathy.start();
        will.start();
    }
}
