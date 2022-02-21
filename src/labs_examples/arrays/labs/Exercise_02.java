package labs_examples.arrays.labs;

import java.util.ArrayList;
import java.util.Scanner;

import java.util.Arrays;

/**
 *  More labs_examples.arrays
 *
 *      Using the array below, take in a number from 1-10 from the user and print out the index of that
 *      element.
 *
 */

public class Exercise_02 {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(10);
        list.add(9);
        list.add(8);
        list.add(7);
        list.add(6);
        list.add(5);
        list.add(4);
        list.add(3);
        list.add(2);
        list.add(1);

        System.out.println(list.indexOf(1));

//        int[] array= {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};

        // write code here
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter a number 1-10: ");
//
//        int num = scanner.nextInt();
//
//        System.out.println("At index " + num + " the number is " + list.indexOf(num));

//        System.out.println("The number at index " + num + " is " + array[num]);



    }



}