package labs_examples.methods;

public class VarArgs {

    public static void main(String[] args) {
        // please create the varargs method as instructed below
        // then, please call the varargs method at least 3 // times here with a different number of arguments
        int count1 = countArgs("seven");
        int count2 = countArgs("nine", "twelve", "four", "three");
        int count3 = countArgs("one", "two");

        System.out.println("count1 is " + count1);
        System.out.println("count2 is " + count2);
        System.out.println("count3 is " + count3);

    }

    // please write a varargs method of your choice that
    // prints out the length of the array of arguments
    // passed into the method below
    public static int countArgs(String... args){
        int count = 0;

        for(String s : args){
            count++;
        }
        return count;
    }

}
