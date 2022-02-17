package labs_examples.arrays.examples;

import java.util.*;

class ArrayListExample {
    public static void main(String args[]) {

        // create array list of String
        ArrayList<String> obj = new ArrayList<String>();

        // add items to the array list
        obj.add("Ryan");
        obj.add("Kim");
        obj.add("Caden");

        // print out the array list
        System.out.println("Currently the arraylist has following elements:" + obj);

        // remove an item from the array list
        obj.remove("Caden");

        // print out modified array list
        System.out.println("Now the arraylist has following elements:" + obj);
        //Arrays are less memory than ArrayLists
        //Arrays can only have one dimension

        ArrayList <String> arrayList = new ArrayList<> ();

        arrayList.add("My name is ");
        arrayList.add("the real ");
        arrayList.add("slim shady.");

        String val = arrayList.get(2);
        System.out.println(val);


    }
}
