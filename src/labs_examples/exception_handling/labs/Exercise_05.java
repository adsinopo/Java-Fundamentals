package labs_examples.exception_handling.labs;

import java.util.Arrays;

/**
 * Exception Handling Exercise 5:
 *
 *      Demonstrate how to throw an exception.
 *
 */

class Example {

    public static void main(String[] args) {
        try{
            mathCheck();
        } catch (ArithmeticException exc){
            System.out.println("printing in the main method");
        }
    }

    public static void mathCheck() throws ArithmeticException{
        anotherCheck();
    }

    public static void anotherCheck() throws ArithmeticException{
        try{
            int z = 4 / 0;
        } catch (ArithmeticException exc){
            System.out.println("Exception caught in anotherCheck");
            throw exc;
        }
    }

}