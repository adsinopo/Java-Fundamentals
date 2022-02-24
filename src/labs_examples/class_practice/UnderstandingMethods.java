package labs_examples.class_practice;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UnderstandingMethods {

    public static void main(String[] args) {
        // the main method is where every application
        // begins by default
        System.out.println("First we're here");
        printCurrentTime();
        System.out.println("Now we're finishing up");
    }
    public static String printCurrentTime(){
        System.out.println("now we're here printing time");
        String time = new SimpleDateFormat("HH:mm:ss").format(new Date());
        System.out.println("The current time is: " + time);
        return time;
    }
}
