package labs_examples.class_practice;

public class Student {

    String name;
    int age;
    String[] courses = new String[2];


    public static void main(String[] args) {
        Student student = new Student();
        student.name = "Bob";
        student.age = 34;
        student.courses[0] = "Java";
        student.courses[1] = "Python";
        System.out.println("Hello, I'm " + student.name + ", I'm " + student.age + " and I'm learning " + student.courses[0] + " & " + student.courses[1]);

    }

}
