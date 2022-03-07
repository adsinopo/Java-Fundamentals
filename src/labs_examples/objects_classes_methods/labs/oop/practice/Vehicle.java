package labs_examples.objects_classes_methods.labs.oop.practice;

//parent class vehicle
public class Vehicle {
    int mpg;
    int fuel_capacity;
    String type;
    // custom constructor replaces default constructor - to create a Vehicle object you
    // must use this custom constructor and pass the required args
    public Vehicle(int mpg, int fuel_capacity, String type){
        this.mpg = mpg;
        this.fuel_capacity = fuel_capacity;
        this.type = type;
    }
}

// child class Motorcycle
class MotorCycle extends Vehicle {
    int cubicLiters;
    // MotorCycle Constructor
    MotorCycle(int cubicLiters, int mpg, int fuel_capacity, String type){
        // call parent constructor first - always first - and pass required parameters
        super(mpg, fuel_capacity, type);
        // setl local variables
        this.cubicLiters = cubicLiters;
    }
}

// child class (of MotorCycle) Ducati
class MotoExample {
    public static void main(String[] args) {
        // Here we must use the custom constructor provided in the Motorcycle class,
        // which calls "super" on the Vehicle class
        MotorCycle bike = new MotorCycle(2000, 25, 16, "Ducati Monster");
    }
}
