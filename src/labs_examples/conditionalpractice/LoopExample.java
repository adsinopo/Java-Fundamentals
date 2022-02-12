package labs_examples.conditionalpractice;

public class LoopExample {

    public static void main(String[] args) {

        int outerCount = 0;
        int innerCount = 0;

        while(outerCount < 10) {

            while (innerCount < 10) {
                System.out.println("outer count = " + outerCount + " and inner count = " + innerCount);
                innerCount++;
            }
            innerCount = 0;
            outerCount++;
        }
        System.out.println("all done with while loop!");

    }
}
