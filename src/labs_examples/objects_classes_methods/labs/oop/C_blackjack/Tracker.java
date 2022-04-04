package labs_examples.objects_classes_methods.labs.oop.C_blackjack;
import java.util.concurrent.atomic.AtomicInteger;
 class Tracker {
     int numGames;
     int playerWins;
     int computerWins;

     Tracker() {
         numGames = 0;
         playerWins = 0;
         computerWins = 0;
     }

     @Override
     public String toString() {
         return "Tracker{" +
                 "numGames=" + numGames +
                 ", playerWins=" + playerWins +
                 ", computerWins=" + computerWins +
                 '}';
     }
 }
