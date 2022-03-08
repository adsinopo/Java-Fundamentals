package labs_examples.objects_classes_methods.labs.oop.practice;

public class DependencyInjectionController {

    public static void main(String[] args) {

        Truck truck = new Truck("Ford", "F150", 120000, 500);
        Sedan sedan = new Sedan("Honda", "Civic", 60000, 80);

        DirtBike dirtBike = new DirtBike("Ducati", "Monster", 500, 1000, false);

        Dependency example = new Dependency(truck);
        example.testMethods();

        example.setTransport(sedan);
        example.testMethods();

        example.setTransport(dirtBike);
        example.testMethods();

    }
}
