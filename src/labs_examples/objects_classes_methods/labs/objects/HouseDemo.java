package labs_examples.objects_classes_methods.labs.objects;


//Question for Jon
public class HouseDemo {
    public static void main(String[] args) {
        Beds b = new Beds(3, "Mattress Firm");
        House h = new House("123 Sycamore Street");
        System.out.println(h.address + " has " + b.brand + " " + b.numOfBeds + " beds.");

    }

}
class Beds {

    int numOfBeds;
    String brand;

    public Beds(int numOfBeds, String brand) {
        this.numOfBeds = numOfBeds;
        this.brand = brand;
    }
}

class House{

    String address;
    public House(String address){
        this.address = address;
    }
}
