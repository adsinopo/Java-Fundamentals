package labs_examples.objects_classes_methods.labs.oop.practice;
// superclass
public class Restaurant {
    private int area;
    private int capacity;
    private String style;

    //default constructor
    public Restaurant(){
        area = 0;
        capacity = 0;
        style ="";
    }
    //constructor
    public Restaurant(int area, int capacity, String style){
        this.area = area;
        this.capacity = capacity;
        this.style = style;
    }
}
class Gourmet extends Restaurant {
    private int waitTime;
    //default constructor
    public Gourmet(){
        // the line below invokes the default (empty) parent constructor
        super();
        waitTime = 0;
    }
    // constructor
    public Gourmet(int area, int capacity, String style, int wt){
        // in the line below we are invoking the parameterized parent constructor
        super(area, capacity, style);
        waitTime = wt;
    }
}

//controller
class RestaurantTester{
    public static void main(String[] args) {
        // create new gourmet restaurant object with specific parameters
        Gourmet fancy = new Gourmet(100, 250, "Italian", 20);

        // create new gourmet restaurant using the default constructors
        Gourmet fancyDefault = new Gourmet();
    }
}
