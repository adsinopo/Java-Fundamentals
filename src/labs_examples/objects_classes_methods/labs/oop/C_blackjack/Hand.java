package labs_examples.objects_classes_methods.labs.oop.C_blackjack;
import java.util.ArrayList;

public class Hand {
    ArrayList<Hand> hand;
    int handValue;

    public Hand(Card card){

    }

    public Hand(ArrayList<Hand> hand, int handValue) {
        this.hand = hand;
        this.handValue = handValue;
    }

    public ArrayList<Hand> getHand() {
        return hand;
    }

    public void setCards(ArrayList<Card> cards) {
        this.hand = hand;
    }

    public int getHandValue() {
        return handValue;
    }

    public void setHandValue(int handValue) {
        this.handValue = handValue;
    }

    @Override
    public String toString() {
        return "Hand{" +
                "hand" + hand +
                ", handValue=" + handValue +
                '}';
    }
}
