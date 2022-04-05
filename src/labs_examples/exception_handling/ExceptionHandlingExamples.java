package labs_examples.exception_handling;

public class ExceptionHandlingExamples {
    public static void main(String[] args) {
//        int[] numbers = {1, 5, 7, 15, 0};
//
//        try{
//            System.out.println(numbers[1] / numbers[4]);
//        } catch(ArrayIndexOutOfBoundsException exc){
//            System.out.println("error detected");
//        } catch(ArithmeticException mathExc){
//            System.out.println("arithmetic error");
//        }
//        System.out.println("Program complete");

//        int[] nums = {67, 43};
//
//         try {
//             System.out.println(nums[5]);
//         } catch (ArrayIndexOutOfBoundsException exc){
//           System.out.println("Error detected. Sorry bout that!");
//         }
//
//        System.out.println("Program complete");
        int[] nums = {67, 43};

        try {

            // comment line below after first run
//            System.out.println(nums[1]);

            // uncomment line below after first run
            System.out.println(nums[5]);

            /* notice how "Program complete" will print no matter what. Whether an error happens or not, the finally block will be executed */

        } catch (ArrayIndexOutOfBoundsException exc) {
            System.out.println("Error detected. Sorry bout that!");
            System.out.println(exc.getMessage());
        } finally {
            System.out.println("Program complete");
        }
    }
}
