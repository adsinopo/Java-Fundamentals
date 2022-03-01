package labs_examples.arrays;
import  java.util.ArrayList;
public class ListPractice {

    public static void main(String[] args) {
        ArrayList<Integer> myList = new ArrayList<>();

        int count = 0;
        for(int i = 0; i < myList.size(); i++){
            count++;
        }
        System.out.println(count + " - ");
    }
}
