package labs_examples.objects_classes_methods.labs.methods;

import labs_examples.class_practice.Person;
import labs_examples.methods.CustomMath;

public class MethodTraining {
    //Demonstrate Overloading

    public static void main(String[] args) {

        int a = 5;
        int b = 10;

        double c = 6.2;
        double d = 10.0;

        int x = CustomMath.multiply(a,b);
        double y = CustomMath.multiply(c,d);
        System.out.println(x);
        System.out.println(y);

        //pass by reference
        Person nick = new Person(24, 70, "Nick");
        Person kasey = new Person(25, 64, "Kasey");

        addHeight(nick);
        System.out.println(nick.toString());

        //pass by value is what we've been doing
        int [] nums = new int[4];
        nums[0] = 8;
        nums[1] = 1;
        nums[2] = 15;
        nums[3] = 2;

        int j = largestNum(nums);
        System.out.println("The largest number is " + j);

        //consonants

        String name = "Nick";
        int q = consonantCount(name);
        System.out.println(q);

        int w = 17;
        boolean prime = isItPrime(w);
        System.out.println(prime);

    }


    public static void addHeight(Person person) {
        person.height = person.height + 1;
    }

    public static int largestNum(int [] nums) {
        int max = 0;
        for (int i = 0; i <= 3; i++){
           if(nums[i] > max){
               max = nums[i];
           }
       }
        return max;
    }
    //4)
    public static int consonantCount(String args) {
        String vowels = "aeiou";
        int count = 0;
        int consonants = 0;
        String str = "";
        while(count < str.length()){
            char c = str.charAt(count);
            int i = vowels.indexOf(c);

            if(i == -1){
                consonants++;
            }
            System.out.println("There are " + consonants + " in the word.");
        }
        return consonants;
    }

    //5
    public static boolean isItPrime(int a){
        boolean isItPrime = true;
        if (a <= 1){
            isItPrime = false;
        }
        else{
            for (int i = 2; i <= a / 2; i++){
                if(a % i == 0){
                    isItPrime = false;
                }
            }
        }
        return isItPrime;
    }
    //6)
    public static int minAndmax (int[] args){
        int max = 0;
        int min = 0;
        min = max = 0;
        for (int i = 0; i < args.length; i++{
            if (args[i] <
        }

    }


}
