package labs_examples.arrays.labs;

import java.util.Scanner;

/**
 * Arrays calculator
 *
 *      Take in 10 numbers from the user. Place the numbers in an array. Using the loop of your choice,
 *      calculate the sum of all of the numbers in the array as well as the average.
 *
 *      Print the results to the console.
 *
 */

public class Exercise_01 {

    public static void main(String[] args) {

        int myArray [] = new int[10];
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");

        myArray[0] = scanner.nextInt();
        myArray[1] = scanner.nextInt();
        myArray[2] = scanner.nextInt();
        myArray[3] = scanner.nextInt();
        myArray[4] = scanner.nextInt();
        myArray[5] = scanner.nextInt();
        myArray[6] = scanner.nextInt();
        myArray[7] = scanner.nextInt();
        myArray[8] = scanner.nextInt();
        myArray[9] = scanner.nextInt();

        int sum = 0;
        double average = 000.00;
        for (int i = 0; i < myArray.length; i++){
            sum += myArray[i];
        }
        System.out.println("sum is " + sum);

        average = (sum) / myArray.length;
        System.out.println("The average is " + average);

    }
}