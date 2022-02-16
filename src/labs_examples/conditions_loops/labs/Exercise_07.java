package labs_examples.conditions_loops.labs;

import java.util.Scanner;

/**
 * Conditions and Loops Exercise 7: First vowel
 *
 *      Take in a word from the user and using a "while" loop, find the first vowel in the word.
 *      Once you find the vowel, print out the word and the first vowel.
 *
 *      Hints:
 *          - there are a few helpful methods in the String class called length(), charAt() and indexOf()
 *          - you'll likely want to use a String that contains all the vowels:
 *              - ie: String vowels = "aeiou";
 *
 */

public class Exercise_07 {

    public static void main(String[] args) {

        String vowels = "aeiou";
        System.out.println("Please enter a word of your choice: ");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();

        int count = 0;

        while(count < str.length()){
            char c = str.charAt(count); // get a char at a given index
            int i = vowels.indexOf(c); // get the index of a given character, within a string

            if(i != -1){
                System.out.println(c + " is the first vowel in " + str);
                return;
            }
            count++;
        }
        System.out.println("The word has no vowels");

    }
}
