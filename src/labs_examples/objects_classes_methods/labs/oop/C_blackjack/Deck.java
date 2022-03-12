package labs_examples.objects_classes_methods.labs.oop.C_blackjack;

import java.util.ArrayList;
import java.util.Objects;

public class Deck {
    //cards is a variable of type Card[]
    //variable declared
    Card[] cards = new Card[52];
    ArrayList<Integer> usedCards;

    public Deck() {
        this.cards = new Card[52];
        int index = 0;
        for (int suit = 0; suit < 4; suit++) {
            for (int rank = 1; rank <= 13; rank++) {
                this.cards[index] = new Card(suit, rank);
                index++;
            }
        }
        this.usedCards = new ArrayList<Integer>();
    }

    public void deal(Player player) {
        int random_card_index = (int) (Math.random() * 52);
        do {
        random_card_index = (int) (Math.random() * 52);

        }while (usedCards.contains(cards[random_card_index]));

        Hand newHand = new Hand(cards[random_card_index]);
            }
}
