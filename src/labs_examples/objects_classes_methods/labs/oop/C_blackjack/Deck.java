package labs_examples.objects_classes_methods.labs.oop.C_blackjack;

import java.util.ArrayList;

public class Deck {
    //cards is a variable of type Card[]
    //variable declared
    Card[] cards = new Card[52];
    ArrayList<Integer> usedCards;
    static int numShuffles;

    public Deck() {
        this.cards = new Card[52];
        int index = 0;
        for (int suit = 0; suit < 4; suit++) {
            for (int rank = 1; rank <= 13; rank++) {
                int value = rank;
                if (rank >= 10) {
                    value = 10;
                }
                this.cards[index] = new Card(suit, rank, value);
                index++;
            }
        }
        this.usedCards = new ArrayList<Integer>();
        numShuffles++;
    }

    public void deal(Player player) {
        int random_card_index = (int) (Math.random() * 52);
        do {
            random_card_index = (int) (Math.random() * 52);

        } while (usedCards.contains(cards[random_card_index]));

        player.hand.playerHand.add(cards[random_card_index]);
        usedCards.add(random_card_index);
        player.hand.calculateScore();
    }
}
