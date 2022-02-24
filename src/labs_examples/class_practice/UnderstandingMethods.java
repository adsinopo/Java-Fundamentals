package labs_examples.class_practice;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UnderstandingMethods {

    public static void main(String[] args) {
        // the main method is where every application
        // begins by default
        String time = getCurrentTime();
        System.out.println("The current time is: " + time);

    }
    public static String getCurrentTime(){
        String time = new SimpleDateFormat("HH:mm:ss").format(new Date());
        return time;
    }
}
