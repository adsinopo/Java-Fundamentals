package labs_examples.conditionalpractice;

//created by Nick Sinopoli


public class ForLoop {

    public static void main(String[] args) {

        // for(initialization; (boolean); iterator)
        // for (int i = 0; i < 10; i += 2) {
        //    System.out.println("i = " + i);

        // please use a for loop below to print out every number between 0 & 100
        for (int a = 0; a < 100; a++) {
            System.out.println("a = " + a);
        }
//        // please use another for loop below to print out every odd number between 100 and 0 in descending order
        for (int b = 100; b >= 0; b--) {
            if (b % 2 != 0) {
                System.out.println("b = " + b);
            }
            // pleasure demonstrate "nesting" two for loops below

        }
        for (int c = 0; c < 5; c++) {
            System.out.println("c = " + c);
            for (int d = 0; d < 5; d++){
                System.out.println("But now d = " + d);
            }

        }
    }
}
