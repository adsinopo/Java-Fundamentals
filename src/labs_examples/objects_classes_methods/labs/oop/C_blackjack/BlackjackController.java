package labs_examples.objects_classes_methods.labs.oop.C_blackjack;
import java.util.Arrays;
public class BlackjackController {
    public static void main(String[] args) {
        Deck deck = new Deck();
        for(Card card : deck.cards){
            System.out.println(card);

        }
        Player player1;
        player1 = new Player();
        deck.deal(player1);
        System.out.println(player1.getHand());

    }
}
