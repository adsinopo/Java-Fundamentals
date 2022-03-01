package labs_examples.arrays.labs;

/**
 *  Traversing Arrays Backwards
 *
 *      Please create and populate an array of your choosing. Then, please demonstrate how to print out every other
 *      element in the array in reverse order.
 *
 */

public class Exercise_05 {

    public static void main(String[] args) {

        int array[] = new int[]{
                4, 7, 8, 12, 15, 14, 29, 33, 45, 57, 63, 99, 19, 87
        };

        int count = 0;
        for (int i = array.length - 1; i >= 0; i--){
            System.out.print(array[i] + " - ");
        }

    }
}
