package labs_examples.datatypes_operators.labs;

/**
 * Please demonstrate the use of all logical operators below. These include:
 *
 * AND, short-circuit AND, OR, short-circuit OR, XOR, NOT
 *
 */
class LogicalOperators {

    public static void main(String[] args) {

        // example of "OR"
        boolean a = true;
        boolean b = false;

        int x = 5;
        int y = 10;

        if ((x++ == 6) && (y++ == 10)){
            System.out.println("x equals " + x + " y equals " + y);

        }


        if (a | b){
            System.out.println("a or b is true");
        }

        // write your code below
        if (a & b){
            System.out.println("This won't print");
        }
        if (a || b){
            System.out.println("a is true");
        }
        if (a && b){
            System.out.println("This won't print");
        }
        if (a != b){
            System.out.println("a and b are different values");
        }
        if (b ^ a){
            System.out.println("one of the values is true, but not both");
        }
    }

}

