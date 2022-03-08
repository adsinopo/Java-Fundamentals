package labs_examples.objects_classes_methods.labs.oop.practice;

public class DirtBike extends VehicleTwo{

    private int cc;
    private boolean twoSeat;

    public DirtBike(String make, String model, double miles, int cc, boolean twoSeat) {
        super(make, model, miles);
        this.cc = cc;
        this.twoSeat = twoSeat;
    }

    public int getCc() {
        return cc;
    }

    public void setCc(int cc) {
        this.cc = cc;
    }

    public boolean isTwoSeat() {
        return twoSeat;
    }

    public void setTwoSeat(boolean twoSeat) {
        this.twoSeat = twoSeat;
    }

    @Override
    public void accelerate(double mph){
        System.out.println("dirt bike accelerating");
        // steps to accelerate a dirt bike
    }

}
