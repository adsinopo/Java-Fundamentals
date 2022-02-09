package labs_examples.fundamentals.examples;

// Created by nicksinopoli
//Variable Scope Practice

public class VariableScope {

    static int globalVar = 10;

    public static void main(String[] args) {
        Vehicle myCar = new Vehicle();
        myCar.make = "Mazda";
        myCar.model = "Mazda 6 Touring";
        myCar.year = 2014;

        if (myCar.make.equalsIgnoreCase("Mazda")){
            String message = "Zoom, zoom!";
            System.out.println(message);
        }
    }

    public static int multiply(int a, int b){

        int result = a * b * globalVar;
        return result;

    }

    public static int divide(int a, int b){
        int val = globalVar / a / b;
        return val;


    }


}
