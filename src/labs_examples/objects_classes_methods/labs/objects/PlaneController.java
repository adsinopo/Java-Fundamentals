package labs_examples.objects_classes_methods.labs.objects;

public class PlaneController {
    public static void main(String[] args) {

        JetEngine jet1 = new JetEngine(1000);
        Cargo cargo1 = new Cargo(400);
        Crew crew1 = new Crew(2);
        Name name1 = new Name("Southwest");

        Airplane plane1 = new Airplane(name1, jet1, crew1, cargo1);

        System.out.println("My plane's airline is " + plane1.getName().getAirline() + ". It holds " + plane1.getCargo().getNumOfBags()
        + " passenger bags. It has " + plane1.getCrew().getPilots() + " pilots on board. The horsepower is " + plane1.getJetEngine().getHorsePower() + ".");

        System.out.println(plane1);

    }
}
