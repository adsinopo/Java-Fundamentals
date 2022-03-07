package labs_examples.objects_classes_methods.labs.oop.practice;

//parent class vehicle
public class Vehicle {
    int mpg;
    int fuel_capacity;
    String type;
    // ...
}

// child class Motorcycle
class MotorCycle extends Vehicle {
    int cubicLiters;
    // ...
}

// child class (of MotorCycle) Ducati
class Ducati extends MotorCycle {
    boolean dryClutch = true;
    // constructor for Ducati
    public Ducati(){
        // the following variables below to Vehicle
        mpg = 30;
        fuel_capacity = 10;
        // cubicLiters belongs to MotorCycle
        cubicLiters = 2000;
    }
    // ...
}
