package labs_examples.arrays;

public class MultiDArray {
    public static void main(String[] args) {

        int[][] twoD = new int [4][7];

        for (int i = 0; i < twoD.length; i++){
            for(int j = 0; j < twoD[i].length; j++){
                twoD[i][j] = i * j;
                System.out.print(twoD[i][j] + " - ");
            }
            System.out.println();
        }
        // OUTPUT
// 0 - 0 - 0 - 0 - 0 - 0 - 0 -
// 0 - 1 - 2 - 3 - 4 - 5 - 6 -
// 0 - 2 - 4 - 6 - 8 - 10 - 12 -
// 0 - 3 - 6 - 9 - 12 - 15 - 18 -
    }
}
