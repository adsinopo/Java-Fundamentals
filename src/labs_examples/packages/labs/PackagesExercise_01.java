package labs_examples.packages.labs;
import labs_examples.packages.labs.mystuff.*;

/**
 * Packages Exercise 1: Protected modifier
 *
 *      1) Within this package, create two new labs_examples.packages.
 *      2) Create a new Java class in each package.
 *      3) Create at least two methods in each class, with at least one with the protected access modifier
 *      4) Demonstrate how the the protected access modifier restricts access from package to package
 *
 */

class Example {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
//        The method below cannot be called because it is protected in
        calculator.divide(100, 5);
        int x = calculator.addition(20, 15);
        System.out.println(x);
    }

}