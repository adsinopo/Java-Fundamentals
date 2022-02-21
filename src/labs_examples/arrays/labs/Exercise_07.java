package labs_examples.arrays.labs;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *  ArrayLists
 *
 *      Please demonstrate how to create an ArrayList, populate an array list, access elements within an ArrayList.
 *      Also take a moment to explore the many methods that are available to you when you use an ArrayList. By simply
 *      typing the dot operator (".") after the ArrayList object that you create. You should see a menu pop up that
 *      shows a list of methods.
 *
 */
public class Exercise_07 {
    public static void main(String[] args) {
        ArrayList<String> roster = new ArrayList<>();

        roster.add("Sam");
        roster.add("Caleb");
        roster.add("Nick");
        roster.add("Tony");
        roster.add("Kasey");
        roster.add("Holly");
        roster.add("Victoria");
        roster.add("Oliver");
        roster.add("Benjamin");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Type in your name: ");

        System.out.println(roster.indexOf("Oliver"));
        System.out.println(roster.get(2));

        // The name Victoria is removed from the list
        // Oliver would now exist at index 6
        roster.remove(6);
        System.out.println(roster.indexOf("Oliver"));

        String name = scanner.next();

        boolean check = roster.contains(name);
            if (check != true){
                System.out.println("That name is not on the list.");
            } else {
                System.out.println("That name is on the list!");
            }

    }
}
