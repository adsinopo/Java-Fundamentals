package labs_examples.conditions_loops.labs;

/**
 * Conditions and Loops Exercise 10: continue
 *
 *      Demonstrate the use of the "continue" statement to skip to the next iteration of a loop.
 *
 */

public class Exercise_10 {
    public static void main(String[] args) {

        int num = 0;
        for (num = 0; num <= 10; num++) {
            if (num == 2 || num == 7) {
                continue;
            }
            System.out.println("num is " + num);
        }
    }
}
