package labs_examples.objects_classes_methods.labs.oop.C_blackjack;
import java.util.Arrays;
public class BlackjackController {
    public static void main(String[] args) {
        Deck deck = new Deck();
        for(Card card : deck.cards){
            System.out.println(card);
        }
    }
}
