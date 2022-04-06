package labs_examples.exception_handling.labs;

/**
 * Exception Handling Exercise 4:
 *
 *      Demonstrate a nested try/catch.
 *
 */

class ExerciseFour{
    public static void main(String[] args) {
        int[] digits = { 2, 0, 14, 5, 22};
        try {
            int z = digits[9];
        } catch (ArrayIndexOutOfBoundsException exc){
            System.out.println("array exception caught");
            try{
                int aa = digits[2] / digits[1];
            }catch (ArithmeticException ex){
                System.out.println("bad math sir");
            }
            System.out.println("complete");
        }
    }
}
