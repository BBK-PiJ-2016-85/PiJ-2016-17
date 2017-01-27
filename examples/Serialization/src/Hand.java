import java.util.ArrayList;
import java.io.Serializable;

public class Hand implements Serializable {
    private ArrayList<Card> hand;

    public Hand(){
        hand = new ArrayList<>();
    }

    public void add(Card c){
        hand.add(c);
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        for (Card c: hand){
            sb.append(c);
            sb.append(", ");
        }
        return sb.toString();
    }
}