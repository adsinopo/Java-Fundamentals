package labs_examples.datatypes_operators.labs;

/**
 * Fundamentals Exercise 4: Volume and Surface Area
 *
 *      Write the necessary code to calculate the volume and surface area of a cylinder
 *      with a radius of 3.14 and a height of 5. Print out the result.
 *
 */

public class Exercise_06 {

    public static void main(String[] args) {

        // write code here
        double radius = 3.14;
        int height = 5;
        double radiusSquared = radius * radius;
        double valueOfpi = 3.1415926;
        double volume = valueOfpi * radiusSquared * height;
        double surfaceArea = ((2 * valueOfpi * radius * height) + (2 * valueOfpi * radiusSquared));
        //volume result
        System.out.println(volume);
        //surface area result
        System.out.println(surfaceArea);

    }
}