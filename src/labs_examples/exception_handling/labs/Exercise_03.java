package labs_examples.exception_handling.labs;

/**
 * Exception Handling Exercise 3:
 *
 *      Demonstrate a try/catch/finally block.
 *
 */

class ExerciseThree {
    public static void main(String[] args) {

        try {
            int x = 5 / 0;
        } catch (ArithmeticException exc) {
            System.out.println("Arithmetic Error caught");
        } finally {
            System.out.println("This will print no matter what");
        }
    }
}
