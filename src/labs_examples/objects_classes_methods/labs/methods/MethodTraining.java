package labs_examples.objects_classes_methods.labs.methods;

import labs_examples.class_practice.Person;
import labs_examples.methods.CustomMath;
import java.util.ArrayList;
import java.util.List;

public class MethodTraining {
    //Demonstrate Overloading

    public static void main(String[] args) {

        int a = 5;
        int b = 10;

        double c = 6.2;
        double d = 10.0;

        int x = CustomMath.multiply(a, b);
        double y = CustomMath.multiply(c, d);
        System.out.println(x);
        System.out.println(y);

        //pass by reference
        Person nick = new Person(24, 70, "Nick");
        Person kasey = new Person(25, 64, "Kasey");

        addHeight(nick);
        System.out.println(nick.toString());

        //pass by value is what we've been doing
        int[] nums = new int[4];
        nums[0] = 8;
        nums[1] = 1;
        nums[2] = 15;
        nums[3] = 2;

        int j = largestNum(nums);
        System.out.println("The largest number is " + j);

        //4 Solution
        String name = "Nick";
        int q = consonantCount(name);
        System.out.println("There are " + q + " consonants in the word.");

        //5 Solution
        int w = 17;
        boolean prime = isItPrime(w);
        System.out.println(prime);

        //6 Solution
        int[] myArray = new int[5];
        int count = 0;

        myArray[0] = 14;
        myArray[1] = 4;
        myArray[2] = 87;
        myArray[3] = 56;
        myArray[4] = 22;

        int [] problemSix = minAndmax(myArray);

        for (int i = 0; i < problemSix.length; i++){
            int num = problemSix[i];
            System.out.print(num + " - ");
        }
        System.out.println();
        //7 Solution
        int maxNum = 33;
        ArrayList<Integer> problemSeven = new ArrayList<Integer>(maxNum);
        int divisor1 = 2;
        int divisor2 = 3;

        problemSeven = mathDivisor(maxNum, divisor1, divisor2);
        System.out.println("The new ArrayList is " + problemSeven);
        System.out.println(problemSeven.size() + " numbers between 0 and " + maxNum + " are divisible by " + divisor1 + " and " + divisor2 + ".");

        //8 solution
        int [] problemEight = reverseArray(myArray);
        for (int i = 0; i < problemEight.length; i++){
            int newNum = problemEight[i];
            System.out.print(newNum + " - ");
        }
    }


    public static void addHeight(Person person) {
        person.height = person.height + 1;
    }

    public static int largestNum(int[] nums) {
        int max = 0;
        for (int i = 0; i <= 3; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
        }
        return max;
    }

    //4)
    public static int consonantCount(String args) {
        String word = args;
        int vowels = 0;
        for(int i = 0; i < word.length(); i++){
            char ch = word.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                vowels++;
            }
        }
            return word.length() - vowels;

    }

    //5
    public static boolean isItPrime(int a) {
        boolean isItPrime = true;
        if (a <= 1) {
            isItPrime = false;
        } else {
            for (int i = 2; i <= a / 2; i++) {
                if (a % i == 0) {
                    isItPrime = false;
                }
            }
        }
        return isItPrime;
    }

    //6)
    public static int[] minAndmax(int[] myArray) {
        int temp;
        int min = myArray[0];
        int max = myArray[0];

        for (int i = 0; i < myArray.length - 1; i++) {
            temp = myArray[i];
            if (temp < min) {
                min = temp;
            }
            if (temp > max) {
                max = temp;
            }
        }
        int[] newArray = new int[2];
        newArray[0] = min;
        newArray[1] = max;
        return newArray;
    }
//    7) Write a method that takes 3 arguments (int maxNum, int divisor1, int divisor2) and returns an Integer Arraylist.
//    In this method create an Integer ArrayList and populate it with each number between zero and maxNum that is
//    divisible by both divisor1 and divisor2. Then return this ArrayList. After calling this method, print out the
//    length of the returned list
    public static ArrayList<Integer> mathDivisor(int maxNum, int divisor1, int divisor2){
        ArrayList<Integer> nums = new ArrayList<Integer>(maxNum);
        ArrayList<Integer> newNums = new ArrayList<>();

        int count = 0;
        for(int i = 0; i <= maxNum; i++){
            nums.add(i);
            count = nums.get(i);
            if(count % divisor1 == 0 && count % divisor2 == 0 && count != 0){
                newNums.add(count);
            }
        }
        return newNums;
    }
//    8) Write a method that will reverse an array in place use only one extra temp variable. For this exercise you cannot
//    instantiate a second array. You must reverse the array in place using only one extra temp variable. Hint: this
//    variable is used to temporarily store individual values in the array
    public static int[] reverseArray(int[] thisArray){
        int temp = 0;

        for(int i = 0; i < thisArray.length / 2; i++){
            temp = thisArray[i];
            thisArray[i] = thisArray[thisArray.length - 1 - i];
            thisArray[thisArray.length - 1 - i] = temp;
        }
        return thisArray;
    }
}
