package labs_examples.fundamentals.labs;

/**
 * Fundamentals Exercise 4: My Second Program
 *
 *      Write the necessary code to display, declare and print each of Java's primitive data types.
 *      Please declare a single variable of each type, give it an appropriate value, then print that variable.
 *
 */

public class Exercise_04 {

    public static void main(String[] args) {

        int i = 1;
        System.out.println("int i is: " + i);

        // write your code below
        char charval = 'a';
        System.out.println("Charval's value is " + charval);
        double trouble = 12.97843;
        System.out.println("A double can hold larger values than a float, like " + trouble);
        float bee = (float) 1.7;
        System.out.println("Float is still useful. It holds smaller values such as " + bee);
        long longVal = 122398;
        System.out.println("Long holds the largest integer value, including as big as " + longVal);
        byte small = 127;
        System.out.println("The byte data type is small, holding numbers up to " +127);
        short stack = 16;
        System.out.println("Short is a little larger, having a size up to " + stack + " bits.");
        boolean pizza = true;
        System.out.println("While it is " + pizza + " the boolean is the smallest. Only having a size of 1 bit.");

    }

}
