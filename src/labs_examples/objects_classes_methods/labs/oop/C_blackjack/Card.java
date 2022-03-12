package labs_examples.objects_classes_methods.labs.oop.C_blackjack;

import java.util.Arrays;

public class Card {
    char[] suits = new char[]{'♠', '♦', '♥', '♣'};
    int suit;
    int rank;
    //TODO: Add a ranks array
    int[] ranks = new int[]{1, 2, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};

    public Card(int suit, int rank) {
        this.suit = suit;
        this.rank = rank;
    }

    public Card() {

    }

    public int getSuit() {
        return suit;
    }

    public void setSuit(int suit) {
        this.suit = suit;
    }

    public int getRank() {
        return this.rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    @Override
    public String toString() {
        return "Card{" +
                "suit=" + suits[suit] +
                ", rank=" + rank +
                '}';
    }
}
