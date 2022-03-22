package labs_examples.objects_classes_methods.labs.oop.C_blackjack;
import java.util.Arrays;
import java.util.Scanner;

public class BlackjackController {
    public static void main(String[] args) {
        playBlackJack();
//        callComputer();
    }

//    public static void callComputer() {
//        if (new Player().computerAI() == true) {
//        }
//    }

    public static void playBlackJack() {
        Deck deck = new Deck();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        Player player1 = new Player(scanner.next(), 100);
        Player computer = new Player("Computer", 100);
        Player computerAI = new Player();

        deck.deal(player1);
        deck.deal(computer);
        deck.deal(player1);
        deck.deal(computer);

        for (player1.hand.handValue = player1.hand.handValue; player1.hand.handValue < 21;) {
            System.out.println(player1.getHand());
            Scanner scanner2 = new Scanner(System.in);
            System.out.println("Do you want another card? ");
            if (scanner2.hasNext("yes")) {
                deck.deal(player1);
                System.out.println("Now you have " + player1.getHand());
            }else{
                break;
            }
        }

        computer.computerAI();
        for(computer.hand.handValue = computer.hand.handValue; computer.computerAI() == true;){
                deck.deal(computer);
            }

        System.out.println("You have " + player1.getHand());
        System.out.println("The computer has " + computer.getHand());

        if (player1.hand.handValue > computer.hand.handValue && (player1.hand.handValue < 21 && computer.hand.handValue < 21)) {
                System.out.println("Congratulations " + player1.getName() + "! You win!");
        }else{
            System.out.println("Sorry " + player1.getName() + "! You lose this time....");
        }
    }
}
