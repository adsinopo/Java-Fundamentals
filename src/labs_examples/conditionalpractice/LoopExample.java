package labs_examples.conditionalpractice;

public class LoopExample {

    public static void main(String[] args) {

        int outterCount = 0;
        int innerCount = 0;

        while(outterCount < 10) {

            while (innerCount < 10) {
                System.out.println("outer count = " + outterCount + " and inner count = " + innerCount);
                innerCount++;
            }
            innerCount = 0;
            outterCount++;
        }
        System.out.println("all done with while loop!");

    }
}
