package labs_examples.objects_classes_methods.labs.methods;

/**
 * Created by ryandesmond - https://codingnomads.co
 */
public class Exercise_01 {

    public static void main(String[] args) {

        // please create the methods as instructed below then
        // call each of those methods from here, within the main()
        int a = 10;
        int b = 6;
        int c = countArgs("one", "two", "three");
        int f = 29;

        int x = multiply(a, b);
        int y = divide(a, b);
        int z = howManySeconds(b);

        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(c);

        joke();

        boolean d = isitPrime(b);
        System.out.println("6 is " + d);
        boolean e = isitPrime(f);
        System.out.println("29 is " + e);


    }


    // 1) Create a static multiply() method below that takes two int arguments (int a, int b) and
    //    returns the result of a * b
    public static int multiply (int a, int b){
        return a * b;
    }

    // 2) Create a static divide() method below that takes two int arguments (int a, int b) and
    //    returns the result of a / b
    public static int divide(int a, int b){
        return a / b;
    }

    // 3) Create a static void method that will print of joke of your choice to the console
    public static void joke(){
        System.out.println("Knock, Knock.");
        System.out.println("Who's there?");
        System.out.println("Interrupting Cow");
        System.out.println("Interrupting C--MOOOOOO!");
    }

    // 4) Create a static method that takes in a number in years (int years) as an argument
    //    and returns the number of seconds that number in years represents
    public static int howManySeconds(int years){
        return years * 365 * 24 * 60 * 60;
    }

    // 5) Create a varargs method that will return the length of the varargs array passed in
    public static int countArgs(String... args){
        int count = 0;

        for(String s : args){
            count++;
        }
        return count;
    }

    public static boolean isitPrime(int a){
        boolean isitPrime = true;
        if (a <= 1){
            isitPrime = false;
        }
        else{
            for(int i = 2; i <= a / 2; i++){
                if(a % i == 0){
                    isitPrime = false;
                }
            }
        }
        return isitPrime;

    }





}
