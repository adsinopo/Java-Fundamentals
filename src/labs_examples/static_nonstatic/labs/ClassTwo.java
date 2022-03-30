package labs_examples.static_nonstatic.labs;

public class ClassTwo {
    public static void main(String[] args) {

    }
    public static int addition(int a, int b){
        System.out.println("Addition method is static");
        return a + b;
    }
    public int division(int a, int b){
        System.out.println("division method is non static");
        return a / b;
    }
}
