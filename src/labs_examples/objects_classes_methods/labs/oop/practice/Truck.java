package labs_examples.objects_classes_methods.labs.oop.practice;

public class Truck extends VehicleTwo{

    private double bedCapacity;

    public Truck(String make, String model, double miles, double bedCapacity){
        super(make, model, miles);
        this.bedCapacity = bedCapacity;
    }

    public double getBedCapacity() {
        return bedCapacity;
    }

    public void setBedCapacity(double bedCapacity) {
        this.bedCapacity = bedCapacity;
    }
}
