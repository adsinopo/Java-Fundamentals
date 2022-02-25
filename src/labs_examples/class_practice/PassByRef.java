package labs_examples.class_practice;

public class PassByRef {

    public static void main(String[] args) {
        Person ryan = new Person(36, 75, "Ryan");
        Person nick = new Person(24, 70, "Nick");

        System.out.println(ryan.toString());

        addYeartoPerson(ryan);

        System.out.println(ryan.toString());
    }

    public static void addYeartoPerson(Person person) {
        person.age = person.age + 1;
    }

}
