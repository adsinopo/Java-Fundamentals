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

    //might need help on this
    public void calculateScore(int handValue){
       playerHand.get(2);
    }

    //returns true if you have busted
    public boolean greaterThan(int handValue){
        if(handValue > 21){
            return true;
        }else{
            return false;
        }
    }
}
