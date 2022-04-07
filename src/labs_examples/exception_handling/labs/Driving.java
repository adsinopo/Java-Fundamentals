package labs_examples.exception_handling.labs;

import java.util.Scanner;

/**
 * Exception Handling Exercise 7:
 *
 *      1) Create a custom exception.
 *      2) Demonstrate a method throwing your custom exception.
 */
public class Driving {
    public static void main(String[] args) {
        try{
            ageTest();
        } catch (AgeException exc){
            System.out.println(exc.toString());
        }
    }

    public static void ageTest() throws AgeException {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the DMV");
        System.out.println("Are you at least 16 years old? (y/n)");
        String answer = scanner.next();

        if(answer.equalsIgnoreCase("n")){
            throw new AgeException();
        } else {
            System.out.println("The open road awaits!");
        }
    }
}