package labs_examples.objects_classes_methods.labs.oop.practice;

public class CarController {

    public static void main(String[] args) {

        Truck truck = new Truck("Ford", "F150", 120000, 500);
        Sedan sedan = new Sedan("Honda", "Civic", 90000, 80);
        DirtBike dirtbike = new DirtBike("Ducati", "Monster", 500, 1000, false);

        System.out.println(truck.getMake() + " " + truck.getModel() + " " + truck.getBedCapacity());
        truck.accelerate(10);

        System.out.println(sedan.getMake() + " " + sedan.getModel() + " " + sedan.getTrunkCapacity());
        sedan.accelerate(20);

        System.out.println(dirtbike.getMake() + " " + dirtbike.getModel() + " " + dirtbike.getCc());
        dirtbike.accelerate(30);

    }

}
