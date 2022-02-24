package labs_examples.class_practice;

public class ClassOne {

    // ACCESS MODIFIERS - affect classes, instance variables and methods they play a large role in
    // Encapsulation - one of the primary tenants of Object-Oriented Programming

//    public int publicVar;
//    protected int protectedVar;
//    private int privateVar;

        public static void main(String[] args) {

            AccessMod obj = new AccessMod();

            // try to set each instance var on the "obj" object
            // hint - only two will work

            obj.publicVar = String.valueOf(12);
            obj.protectedVar = String.valueOf(4);
//            private doesn't work
//            obj.privateVar = String.valueOf(9);
            
        }
    }

    class AccessMod {

        public String publicVar;
        protected String protectedVar;
        private String privateVar;

    }

