package labs_examples.conditionalpractice;

public class ForEachLoop {

    public static void main(String[] args) {

//        for(String val : args){
//            System.out.println(val);
//        }
        System.out.println("Starting...");
        for (int i = 0; i < 10; i++){
            System.out.println("** Outer Loop - i = " + i + " **");
            for (int j = 0; j < 7; j++){
                System.out.print("Inner Loop: j = " + j + " | ");
            }
            // this is just two line breaks
            System.out.println("\n\n");
        }
        System.out.println("Done!");

    }


}
