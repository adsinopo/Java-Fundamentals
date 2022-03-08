package labs_examples.objects_classes_methods.labs.oop.practice;

public class VehicleTwo {

    protected String make;
    protected String model;
    protected double miles;
// a final variable or method CANNOT be Overridden
    public final double PI = 3.1415926;

    public VehicleTwo() {
    }

    public VehicleTwo(String make, String model, double miles) {
        this.make = make;
        this.model = model;
        this.miles = miles;
    }

    public void accelerate(double mph){
        System.out.println("vehicle accelerating by " + mph + " mph");
        // steps to accelerate a vehicle
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getMiles() {
        return miles;
    }

    public void setMiles(double miles) {
        this.miles = miles;
    }
}
