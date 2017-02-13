import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjectInputOutputStream {

    public static void main(String[] args) {
        Hand hand = new Hand();
        Card card = new Card(12, Card.SPADES);
        hand.add(card);
        card = new Card(1, Card.DIAMONDS);
        hand.add(card);
        System.out.println("Hand to write is: " + hand);

        try (ObjectOutputStream oos = new ObjectOutputStream(
                new FileOutputStream("hand.out"));
        ) {
            oos.writeObject(hand);
            oos.flush();
        } catch (Exception e) {
            System.out.println("Problem serializing: " + e);
        }

        hand = null;

        try (ObjectInputStream ois = new ObjectInputStream(
                new FileInputStream("hand.out"))){
            hand = (Hand) (ois.readObject());
        } catch (Exception e) {
            System.out.println("Problem serializing: " + e);
        }

        System.out.println("Hand read is: " + hand);
    }
}
