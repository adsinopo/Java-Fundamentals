package labs_examples.objects_classes_methods.labs.oop.C_blackjack;
import java.util.Scanner;

public class BlackjackController {
    public static void main(String[] args) {
        playBlackJack();
        Tracker tracker = new Tracker();
        System.out.println((tracker.numGames - 1) + " games played.");

        Result result = new Result();
        System.out.println("The player has " + (result.playerWins - 1) + " win(s)");

        otherResult other = new otherResult();
        System.out.println("The computer has " + (other.computerWins - 1) + " win(s)");

    }

    public static void playBlackJack() {
        //This creates the deck and the players
        Deck deck = new Deck();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        Player player1 = new Player(scanner.next(), 100);
        Player computer = new Player("Computer", 100);

        do {
            Tracker tracker = new Tracker();
            //This is the beginning of the game
            Scanner scanner1 = new Scanner(System.in);
            System.out.print("Enter your bet: ");
            int playerBet;
            double computerBet;
            playerBet = scanner.nextInt();
            if (playerBet > computer.potValue) {
                computerBet = computer.potValue;
            } else {
                computerBet = playerBet;
            }
            System.out.println("The computer bets " + computerBet);

            //Dealing the hands
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
                // The player garners a win
                Result result = new Result();
            } else if (player1.hand.handValue < computer.hand.handValue && computer.hand.busted()) {
                System.out.println("Congratulations " + player1.getName() + "! You win!");
                player1.potValue += computerBet;
                computer.potValue -= computerBet;
                Result result = new Result();
            } else if (player1.hand.busted() && computer.hand.busted()){
                System.out.println("Sorry you both lose! The house wins!");
                computer.potValue -= computerBet;
                player1.potValue -= playerBet;
            } else if (player1.hand.handValue < computer.hand.handValue && (!player1.hand.busted() && !computer.hand.busted())) {
                System.out.println("Sorry " + player1.getName() + "! You lose this time....");
                computer.potValue += playerBet;
                player1.potValue -= playerBet;
                // The computer garners a win
                otherResult other = new otherResult();
            } else if (player1.hand.handValue > computer.hand.handValue && player1.hand.busted()) {
                System.out.println("Sorry " + player1.getName() + "! You lose this time....");
                computer.potValue += playerBet;
                player1.potValue -= playerBet;
                otherResult other = new otherResult();
            } else if (player1.hand.handValue == computer.hand.handValue && (!player1.hand.busted() && !computer.hand.busted())) {
                System.out.println("You tied! Split pot.");
                // No one wins any money
            } else {
                System.out.println("Sorry you both lose! The house wins!");
                computer.potValue -= computerBet;
                player1.potValue -= playerBet;
            }
            System.out.println("The computer has " + computer.potValue + " chips.");
            System.out.println("You have " + player1.potValue + " chips.");

            player1.hand.playerHand.clear();
            computer.hand.playerHand.clear();
            deck.usedCards.clear();

            //Game will continue until either player loses all of their money
//            System.out.println(tracker.numGames + " games played.");
        } while (player1.potValue > 0 && computer.potValue > 0);
        if (player1.potValue == 0) {
            System.out.println("Sorry you lost all of your money :(. Time to go to the ATM.");
        } else {
            System.out.println("You are victorious! You have " + player1.potValue + " chips and the computer is flat broke.");
        }
    }
}
