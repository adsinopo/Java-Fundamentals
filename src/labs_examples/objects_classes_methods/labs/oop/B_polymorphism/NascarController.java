package labs_examples.objects_classes_methods.labs.oop.B_polymorphism;

public class NascarController {
    public static void main(String[] args) {

        Nascar nascar = new Nascar("Dale Jr.", "Mountain Dew", 8);
        Nascar tony = new Nascar("Tony Stewart", "Home Depot", 20);
        nascar.speedUp(100);
        tony.speedUp(125);

        nascar.slowDown(5);
        tony.slowDown(20);

        nascar.currentSpeed();
        tony.currentSpeed();
    }
}
