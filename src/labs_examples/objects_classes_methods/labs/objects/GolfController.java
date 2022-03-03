package labs_examples.objects_classes_methods.labs.objects;

public class GolfController {
    public static void main(String[] args) {
        Golf golfer1 = new Golf("Tyler", 14, "Callaway");
        Golf golfer2 = new Golf();
        Golf golfer3 = new Golf("Nick", 14, "Ping", "ProV1", true);

        golfer2.name = "Tony";
        golfer2.clubs = 14;
        golfer2.brand = "Ping";
        golfer2.balls = "BridgeStone";
        golfer2.rangeFinder = true;

        System.out.println("Golfer " + golfer1.name + " has " + golfer1.clubs + " clubs in his bag and plays " +
                golfer1.brand + " clubs.");
        System.out.println("Golfer " + golfer2.name + " has " + golfer2.clubs + " clubs in his bag and plays " +
                golfer2.brand + " clubs. He hits " + golfer2.balls + " balls on the course.");
        System.out.println("Golfer " + golfer3.name + " has " + golfer3.clubs + " clubs in his bag and plays " +
                golfer3.brand + " clubs. He hits " + golfer3.balls + " balls on the course.");
    }
}

class Golf{
    String name;
    int clubs;
    String brand;
    String balls;
    boolean rangeFinder;

    public Golf(){}

    public Golf(String name, int clubs, String brand) {
        this.name = name;
        this.clubs = clubs;
        this.brand = brand;
    }

    public Golf(String name, int clubs, String brand, String balls, boolean rangeFinder) {
        this.name = name;
        this.clubs = clubs;
        this.brand = brand;
        this.balls = balls;
        this.rangeFinder = rangeFinder;
    }
}



