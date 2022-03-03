package labs_examples.class_practice;


// created by Nick Sinopoli
// never have a lowercase Class
public class Person {

    // instance variables
    public int age;
    public double height;
    public String name;

    // constructors
    public Person(){}
    // this is basically overloading
    public Person(int age, double height, String name){
        this.age = age;
        this.height = height;
        this.name = name;
    }

    // methods


    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", height=" + height +
                ", name='" + name + '\'' +
                '}';
    }
}
