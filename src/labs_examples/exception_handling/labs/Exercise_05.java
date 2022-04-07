package labs_examples.exception_handling.labs;

/**
 * Exception Handling Exercise 5:
 *
 *      Demonstrate how to throw an exception.
 *
 */

class Example {

    public static void main(String[] args) {
        try{
            int z = divide(12, 0);
        } catch (ArithmeticException exc){
            System.out.println("exception caught");
        }
    }

    public static int divide(int a, int b) throws ArithmeticException{
        return a / b;
    }

}