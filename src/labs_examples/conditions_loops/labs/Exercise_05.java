package labs_examples.conditions_loops.labs;

import java.util.Scanner;

/**
 * Conditions and Loops Exercise 5: Calculator
 *
 *      Take two numbers from the user, an upper and lower bound. Using a "for-loop", calculate the sum
 *      of numbers from the lower bound to the upper bound. Also, calculate the average of numbers.
 *      Print the results to the console.
 *
 *      For example, if a user enters 1 and 100, the output should be:
 *
 *      The sum is: 5050
 *      The average is: 50.5
 *
 *
 */
public class Exercise_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("First number: ");
        int lowerBound = scanner.nextInt();
        System.out.println("The lower bound is  " + lowerBound);

        System.out.println("Second number: ");
        int upperBound = scanner.nextInt();
        System.out.println("The upper bound is " + upperBound);

        int sum = 0;
        double average = 0.0;

        for(int count = lowerBound; count <= upperBound; count++){
            sum += count;//sum = sum + count;

        }
        System.out.println("Sum = " + sum);

        average = (lowerBound + upperBound) / 2.0;
        System.out.println("The average is " + average);

        // ask the user for two more numbers
        int temp = upperBound;
        sum = 0;
        while(temp >= lowerBound){
            sum += temp; //sum = sum + temp; I want temp to be added to the current value of sum.
            temp--;
        }
        System.out.println(sum);
    }
}