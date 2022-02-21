package labs_examples.arrays;

public class ForEachLoop {

    public static void main(String[] args) {

        int[] vals = new int[5];
        //we'll use a traditional for loop to populate the array
        //because we need to use indexes to place the values in the array
        for (int i = 0; i < vals.length; i++){
            vals[i] = i * 2;
        }
        // currently, the "vals" array looks like [0, 2, 4, 6, 8]

        // now we'll use a For-Each Loop to iterate through the array and print each value
        for(int val : vals){
            // here "val" is the actual value in "vals"
            // the for-each loop will iterate through the array from
            // top to bottom - on each loop the value of "val" will change
            System.out.println(val);
        }
        System.out.println("--------------------");

        int [][] twoDArray = new int[3][5];

        for (int h = 0; h < twoDArray.length; h++){
            for (int k = 0; k < twoDArray[h].length; k++){
                twoDArray[h][k] = h * k;
            }
        }

        for (int [] vals2 : twoDArray){
            for (int k : vals){
                System.out.print( k + " ");
            }
            System.out.println("***");
        }

    }

}
