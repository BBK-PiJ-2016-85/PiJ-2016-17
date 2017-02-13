import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Hand implements Serializable {
    private List<Card> hand;

    public Hand() {
        hand = new ArrayList<>();
    }

    public void add(Card c) {
        hand.add(c);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Card c : hand) {
            sb.append(c);
            sb.append(", ");
        }
        return sb.toString();
    }
}
