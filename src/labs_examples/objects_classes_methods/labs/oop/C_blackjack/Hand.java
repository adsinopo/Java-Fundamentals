package labs_examples.objects_classes_methods.labs.oop.C_blackjack;
import java.util.ArrayList;

public class Hand {
    ArrayList<Card> playerHand;
    int handValue;

    public Hand(){

    }
    public Hand(ArrayList<Card> playerHand, int handValue) {
        this.playerHand = playerHand;
        this.handValue = handValue;
    }

    public ArrayList<Card> getPlayerHand() {
        return playerHand;
    }

    public void setPlayerHand(ArrayList<Card> playerHand) {
        this.playerHand = playerHand;
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
                "playerHand=" + playerHand +
                ", handValue=" + handValue +
                '}';
    }
}
