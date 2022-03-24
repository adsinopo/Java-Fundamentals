package labs_examples.objects_classes_methods.labs.oop.C_blackjack;

import java.util.Arrays;
import java.util.Scanner;

public class BlackjackController {
    public static void main(String[] args) {
        playBlackJack();
    }

    public static void playBlackJack() {
//        Deck deck = new Deck();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        Player player1 = new Player(scanner.next(), 100);
        Player computer = new Player("Computer", 100);
//        System.out.print("Enter your bet: ");

//        Where do i put this???
        do{
            Deck deck = new Deck();
            Scanner scanner1 = new Scanner(System.in);
            System.out.print("Enter your bet: ");
            int playerBet;
            double computerBet;
            playerBet = scanner1.nextInt();
            computerBet = computer.potValue * .15;
            System.out.println("The computer bets " + computerBet);

            deck.deal(player1);
            deck.deal(computer);
            deck.deal(player1);
            deck.deal(computer);

            while (!player1.hand.busted()) {
                System.out.println(player1.getHand());
                System.out.println("Do you want another card? ");
                if (scanner1.hasNext("yes") || scanner1.hasNext("Yes")) {
                    deck.deal(player1);
                    System.out.println("Now you have " + player1.getHand());
                    scanner1.next();
                } else {
                    break;
                }
            }

            while (computer.computerAI()) {
                deck.deal(computer);
            }

            System.out.println("You have " + player1.getHand());
            System.out.println("The computer has " + computer.getHand());

//          These are the game conditions
            if (player1.hand.handValue > computer.hand.handValue && !player1.hand.busted()) {
                System.out.println("Congratulations " + player1.getName() + "! You win!");
                player1.potValue += computerBet;
                computer.potValue -= computerBet;
            } else if (player1.hand.handValue < computer.hand.handValue && computer.hand.busted()) {
                System.out.println("Congratulations " + player1.getName() + "! You win!");
                player1.potValue += computerBet;
                computer.potValue -= computerBet;
            } else if (player1.hand.handValue < computer.hand.handValue && (!player1.hand.busted() && !computer.hand.busted())) {
                System.out.println("Sorry " + player1.getName() + "! You lose this time....");
                computer.potValue += playerBet;
                player1.potValue -= playerBet;
            } else if (player1.hand.handValue > computer.hand.handValue && player1.hand.busted()) {
                System.out.println("Sorry " + player1.getName() + "! You lose this time....");
                computer.potValue += playerBet;
                player1.potValue -= playerBet;
            } else if (player1.hand.handValue == computer.hand.handValue && (!player1.hand.busted() && !computer.hand.busted())) {
                System.out.println("You tied! Split pot.");
                // No one wins any money
//                computer.potValue -= computerBet;
//                player1.potValue -= playerBet;
            } else {
                System.out.println("Sorry you both lose! The house wins!");
                computer.potValue -= computerBet;
                player1.potValue -= playerBet;
            }
            System.out.println("The computer has " + computer.potValue + " chips.");
            System.out.println("You have " + player1.potValue + " chips.");

//            player1.hand.playerHand.remove();
//            computer.hand.playerHand.remove();
        } while (player1.potValue > 0 && computer.potValue > 0);
    }
}
