package labs_examples.arrays.labs;

/**
 *  Irregular Arrays
 *
 *      Create and populate a 2 dimensional irregular array of size and contents of your choosing. Using a nested
 *      "for-each" loop, iterate and print out each element of the array.
 *
 */

public class Exercise_04 {

    public static void main(String[] args) {

        int[][] irregArray = {
                {10, 9},
                {78, 109, 123},
                {156, 8, 402, 99},
        };

        // This is the method for a "nested for loop"
//        for (int i = 0; i < irregArray.length; i++){
//            for (int j = 0; j < irregArray[i].length; j++){
//                System.out.print(irregArray[i][j] + " - ");
//            }
//            System.out.println();
//        }

        //This is how to do it with a "nested for-each loop"
        for (int [] val : irregArray){
            for (int j : val){
                System.out.print(j + " - ");
            }
            System.out.println();
        }

    }
}
