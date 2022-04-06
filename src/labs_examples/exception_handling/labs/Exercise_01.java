package labs_examples.exception_handling.labs;

/**
 * Exception Handling Exercise 1:
 *
 *      1) Demonstrate a try/catch.
 *
 */

class ExerciseOne {
    public static void main(String[] args) {

        int[] numbs = {2, 5, 9, 12};

        try {
            int x = numbs[8];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException caught");
        }
    }
}