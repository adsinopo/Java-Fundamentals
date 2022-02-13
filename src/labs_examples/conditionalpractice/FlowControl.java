package labs_examples.conditionalpractice;

public class FlowControl {

    public static void main(String[] args) {

        // FLOW CONTROL
        // continue, break, return

        for (int i = 0; i < 10; i++) {
            if (i == 3 || i == 7) {
                // forces an early iteration of the loop
                continue;
            }
            System.out.println("i = " + i);
        }

        // break
        for (int i = 0; i < 10; i++) {
            if (i == 3 || i == 7) {
                // exits the nearest loop
                break;
            }
            System.out.println("i = " + i);
        }

            int i = someMethod(1);
            System.out.println("i = " + i);
    }

    public static int someMethod(int val) {
        // return exits the current method
        // will return a value if the method requires
        if (val == 0) {
            System.out.println("1) will this print?");
            return 0;
        } else if (val == 1) {
            System.out.println("2) will this print?");
            return 1;
        } else {
            System.out.println("3) will this print?");
            return -1;

        }
    }

}
