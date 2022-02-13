package labs_examples.conditionalpractice;

public class FlowControl {

    public static void main(String[] args) {

        // FLOW CONTROL
        // continue, break, return

        for(int i = 0; i < 10; i++){
            if(i == 3 || i == 7){
                // forces an early iteration of the loop
                continue;
            }
            System.out.println("i = " + i);
        }


    }
}
