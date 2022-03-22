package labs_examples.objects_classes_methods.labs.oop.C_blackjack;
import java.util.Arrays;
import java.util.Scanner;

public class BlackjackController {
    public static void main(String[] args) {
        Deck deck = new Deck();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");

        Player player1 = new Player(scanner.next(), 100);
        Player computer = new Player("Computer", 100);

        deck.deal(player1);
        deck.deal(computer);
        deck.deal(player1);
        deck.deal(computer);

        System.out.println(player1.getHand());
        Scanner scanner2 =new Scanner(System.in);
        deck.deal(player1);

        System.out.println(computer.getHand());
        deck.deal(computer);

//        public void playBlackJack(Player){
//
//        }
//        for(Card card : deck.cards){
//            System.out.println(card);
//
//        }
//        Player player1;
//        player1 = new Player("Jon", 100);
//        deck.deal(player1);
//        Player player2 = new Player();
//        System.out.println(player1.getHand());
//        deck.deal(player1);
//        System.out.println(player1.getHand());

    }
}
