package labs_examples.class_practice;

public class MethodPractice {

    public static void main(String[] args) {
        System.out.println("It starts here");
        printMethod();
        System.out.println("And now we are done");
    }

    public static String printMethod(){
        System.out.println("Then enters here");
        String method = "printMethod() called!";
        System.out.println(method);
        return method;
    }

}
