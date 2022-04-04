package labs_examples.static_nonstatic.labs;

public class ClassOne {
    public static void main(String[] args) {
        // A static method calling another static method in the same class (call the method)
        ClassOne.Nick();
        // A static method calling a non-static method in the same class
        // (create an object, use the dot, call the method)
        ClassOne sameClass = new ClassOne();
        sameClass.Jon();
        // A static method calling a static method in another class
        // call the class, call the method
//        int x = Math.
        int a = 12;
        int b = 5;
        int c = ClassTwo.addition(a, b);
        System.out.println(c);
        // A static method calling a non-static method in another class
        // (create object, call the class, call the method)
        ClassTwo differentClass = new ClassTwo();
        int d = differentClass.division(a,b);
        System.out.println(d);
    }
    public void nonStaticMethod(){
        // A non-static method calling a non-static method in the same class
        // (call the method)
        this.Ryan();
        // A non-static method calling a non-static method in another class
        // (create an object in the new class, call the object, use the dot operator, call the method)
        ClassTwo obj = new ClassTwo();
        obj.division(10, 2);
        // A non-static method calling a static method in the same class
        // (just call the method)
        ClassOne.Nick();
        // A non-static method calling a static method in another class
        // (call the class, use the dot operator, call the method)
        ClassTwo.addition(10, 2);
    }

    public static void Nick(){
        System.out.println("The Nick method is static");
    }
    public void Jon(){
        System.out.println("The Jon method is non-static");
    }
    public void Ryan(){
        System.out.println("Ryan is non-static");
    }
}
