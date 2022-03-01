package labs_examples.arrays.examples;

public class HowToIterate {

    public static void main(String[] args) {

        int [] myArray = new int[5];
        int count = 0;

        for (int i = 0; i < myArray.length; i++){
            count++;
            System.out.print(count + " - ");
        }
    }

}
