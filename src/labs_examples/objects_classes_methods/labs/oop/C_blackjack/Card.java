package labs_examples.objects_classes_methods.labs.oop.C_blackjack;

import java.util.Arrays;

public class Card {
    char[] suits = new char[]{'♠', '♦', '♥', '♣'};
    int suit;
    int rank;
    //TODO: Add a ranks array
    String[] ranks = new String[]{"Ace", "Two", "Three", "Four", "Five", "Six", "Seven",
            "Eight", "Nine", "Ten", "Jack", "Queen", "King"};
    int value;
//    int[] value = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10};


    public Card(int suit, int rank, int value) {
        this.suit = suit;
        this.rank = rank;
        this.value = value;
    }

    public Card(int rank) {
        this.rank = rank;
    }

    public Card() {

    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
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
//        return "Card{" +
//                "suit=" + suits[suit] +
//                ", rank=" + rank +
//                ", value=" + value + "}";
        return "The " + ranks[rank - 1] + " of " + suits[suit] + "'s";
    }
}
