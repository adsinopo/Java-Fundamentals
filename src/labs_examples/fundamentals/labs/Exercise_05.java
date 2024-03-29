package labs_examples.fundamentals.labs;


/**
 * Fundamentals Exercise 5: Working with Strings
 *
 *      Please follow the instructions in the comments below
 *
 */

public class Exercise_05 {

    public static void main(String[] args) {

        String str = "hello!";
        // please declare an int variable below, and set it to the value of the length of "str"
        int x = str.length();
        String str2 = "Will the real slim shady please stand up?";
        // please initialize a boolean variable and test whether str is equal to str2
        boolean equals = "hello".equals(str2);
        System.out.println("Do str1 and str2 match? " + equals);
        // please concatenate str & str2 and set the result to a new String variable below
        String str3 = "Hello, " + "the value of x is: " + x + "!";
        System.out.println(str3);
        double d = 10;
        int e = (int) d;
        double f = 100.04;
        long l = (long)f;
        int p = (int)l;
        System.out.println("Long value " + l);
        System.out.println("int value " + p);
        // please demonstrate the use of any other method that is available to us in the String class
        // for example, replace(), substring(), contains(), indexOf() etc
        int search = "hello!".indexOf("e");
        System.out.println(search);
    }


}