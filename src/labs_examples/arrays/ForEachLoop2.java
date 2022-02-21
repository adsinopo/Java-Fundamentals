package labs_examples.arrays;

public class ForEachLoop2 {

    public static void main(String[] args) {

        int[][][] vals = new int[3][5][4];
        int count = 0;
        // please populate the array list
        for (int i = 0; i < vals.length; i++) {
            for (int j = 0; j < vals[i].length; j++) {
                for (int k = 0; k < vals[i][j].length; k++) {
                    vals[i][j][k] = count;
                    count++;
                }
            }
        }
        for (int[][] outer : vals) {
            for (int[] middle : outer) {
                for (int val : middle) {
                    System.out.print(val + " - ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
