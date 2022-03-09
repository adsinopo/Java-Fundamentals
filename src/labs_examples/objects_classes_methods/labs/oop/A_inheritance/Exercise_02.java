package labs_examples.objects_classes_methods.labs.oop.A_inheritance;

/**
 * Run the class below and study the output. What prints and why?
 *
 * Your answer:
 *
 * We have defined the object 'a'. It is the parent class. When it is called, a refers to the parent.
 * NOW, if we create the method "B b = new B();"
 * And write a SOUT method for 'b.i', then 20 will print.
 */
class A {
    int i = 10;
}

class B extends A{
    int i = 20;
}

public class Exercise_02 {

    public static void main(String[] args) {
        A a = new A();
        B b = new B();

        System.out.println(a.i);
        System.out.println(b.i);
    }
}