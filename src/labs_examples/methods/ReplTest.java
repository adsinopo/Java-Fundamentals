package labs_examples.methods;

import java.util.Scanner;

public class ReplTest {

    public static void main(String[] args) {

        // please write the four methods as instructed below
        // then call each method from here within the main()
        int x = multiply(4, 9);
        int z = divide(100, 5);
        boolean y = isOdd(14);


        System.out.println(z);
        System.out.println(x);
        System.out.println(y);
        reverseMethod("");
    }

    // please write a static multiply() method below that takes
    // two parameters (arguments) and returns the result of
    // multiplying them together

    public static int multiply(int a, int b) {
        return a * b;
    }
    // please write a static divide() method below that takes
    // two parameters (arguments) and returns the result of
    // dividing the first parameter by the second parameters
    public static int divide(int a, int b){
        return a / b;
    }
    // please write a static isOdd() method that takes one numeric
    // parameter and returns a true (boolean) if the parameter is odd
    public static boolean isOdd(int a){
        boolean check = true;
        if (a % 2 != 0){
            System.out.println("The number is Odd");
        }
        else{
            System.out.println("The number is Even");
        }
        return check;
    }
    // please write a method that will take in a String (as an argument)
    // and return that String in reverse order. For instance, if you pass
    // in the String "programming is cool" the method will return the
    // String "looc si gnimmargorp"

    public static String reverseMethod(String s){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a word or phrase: ");
        String str = scanner.nextLine();
        String reverse = "";

        for(int i = str.length() - 1; i >= 0; i--){
            reverse += str.charAt(i);
        }
        System.out.println("The Reversed Phrase is: ");
        System.out.println(reverse);
        return reverse;
    }

}
