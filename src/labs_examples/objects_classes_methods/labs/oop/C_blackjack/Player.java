package labs_examples.objects_classes_methods.labs.oop.C_blackjack;

import sun.awt.util.IdentityArrayList;

public class Player {
    String name;
    Hand hand;
    int potValue;

    public Player(String name, int potValue) {
        this.name = name;
        this.hand = new Hand();
        this.potValue = potValue;
    }

    public Player() {

    }

    public boolean computerAI(){
        if(hand.handValue < 16){
            return true;
        }else{
            return false;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Hand getHand() {
        return hand;
    }

    public void setHand(Hand hand) {
        this.hand = hand;
    }

    public int getPotValue() {
        return potValue;
    }

    public void setPotValue(int potValue) {
        this.potValue = potValue;
    }
}
