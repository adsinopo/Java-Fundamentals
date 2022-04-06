package labs_examples.exception_handling.labs;

/**
 * Exception Handling Exercise 2:
 *
 *      Demonstrate a try/catch with multiple catch statements.
 *
 */

class ExerciseTwo {
    public static void main(String[] args) {
        int[] array = {4, 6, 9, 12};

        try {
            int x = 4 / 2;
            //this one will not print
            int y = array[10];
        } catch (ArithmeticException exc) {
            System.out.println("Oops ArithmeticException Caught");
        } catch (ArrayIndexOutOfBoundsException exc) {
            System.out.println("Oops ArrayIndex caught");
        }
    }
}


