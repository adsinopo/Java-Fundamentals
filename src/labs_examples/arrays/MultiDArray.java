package labs_examples.arrays;

public class MultiDArray {
    public static void main(String[] args) {

        int multi[][] = new int[4][5];
        int count = 0;

        for (int i = 0; i < multi.length; i++) {
            for (int j = 0; j < multi[i].length; j++) {
                multi[i][j] = count;
                count++;//populated
                System.out.print(multi[i][j] + " - "); //printing each element
            }
            System.out.println();


            // OUTPUT

//        }
//        for (int i = 0; i < multi.length; i++) {
//            for (int j = 0; j < multi[i].length; j++) {
//                System.out.print(multi[i][j] + " - ");
//            }
//            System.out.println();
       }
    }
}