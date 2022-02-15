package labs_examples.conditions_loops.labs;

/**
 * Conditions and Loops Exercise 9: break
 *
 *      Demonstrate the use of the "break" statement to exit a loop.
 *
 */

public class Exercise_09 {

    public static void main(String[] args) {

        int num = 0;
        for(num = 10; num > 0; num--){
            if(num == 4){
                break;
            }
            System.out.println("num is " + num);
        }

    }

}
