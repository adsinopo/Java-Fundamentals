package labs_examples.class_practice;

public class ClassTwo {

    public static void main(String[] args) {
        ClassOne classOne = new ClassOne();

        classOne.publicVar = 10;
        classOne.protectedVar = 20;
        classOne.privateVar = 30;

        public void changePrivateVar(int val){
            privateVar = val;
        }
        
    }

}
