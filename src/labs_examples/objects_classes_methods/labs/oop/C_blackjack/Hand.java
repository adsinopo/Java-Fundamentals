package labs_examples.objects_classes_methods.labs.oop.C_blackjack;
import java.util.ArrayList;

public class Hand {
    ArrayList<Card> playerHand;
    int handValue;

    public Hand(){
        this.playerHand = new ArrayList<>();
        this.handValue = 0;
    }
    public Hand(ArrayList<Card> playerHand, int handValue) {
        this.playerHand = playerHand;
        this.handValue = handValue;
    }

    //might need help on this
    public void calculateScore(){
        handValue = 0;
//        for(int i = 0; i < playerHand.size(); i++){
//            handValue += playerHand.get(i).value;
//        }
//
//        these are the same thing. For each loop is more intuitive
        // you don't need the index here
        for(Card myCard : playerHand){
            handValue += myCard.value;
        }
    }

    //returns true if you have busted
    public boolean greaterThan(){
        if(handValue > 21){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public String toString() {
        return playerHand +
                " your hand is worth " + handValue + " points.";
    }
}
