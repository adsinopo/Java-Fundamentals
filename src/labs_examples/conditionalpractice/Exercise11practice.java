package labs_examples.conditionalpractice;

public class Exercise11practice {

    public static void main(String[] args) {

        for(int num = 1; num <= 10; num++){// I want num to increment until it reaches 10
            for(int num2 = 1; num2 <= 10; num2++){ //every time num increments ONE TIME, I want num2 to increment 10 times
                int multiple = num * num2; //every time num2 increments ONCE, I want num and num 2 multiplied to each other.
                if(multiple < 10){ // If the multiple is less than 10
                    System.out.print(multiple + "  |"); //for example "7  |"
                }else if(multiple < 99){
                    System.out.print(multiple + " |"); //for example "14 |"
                }else{
                    System.out.print(multiple + "|"); //for example "100|"
                }
            }

            System.out.println(); //every time num2 reaches 10, I want a new line to print
        }

    }

}
