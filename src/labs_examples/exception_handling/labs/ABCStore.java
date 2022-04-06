package labs_examples.exception_handling.labs;

import labs_examples.exception_handling.UnderageException;

import java.util.Scanner;

public class ABCStore {
    public static void main(String[] args) {

        try {
            buyBeer();
        } catch (UnderageException e) {
            System.out.println(e.toString());
        }
    }

    public static void buyBeer() throws UnderageException {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Wake County ABC");
        System.out.println("Are you over 21 years old? (y/n)");
        String response = scanner.next();

        if(response.equalsIgnoreCase("n")){
            throw new UnderageException();
        }else{
            System.out.println("Great, what would you like to buy?");
            //
        }
    }
}
