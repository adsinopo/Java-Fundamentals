package labs_examples.objects_classes_methods.labs.oop.B_polymorphism;

public class NonFiction extends Books{
    String genre;
    String time_period;
    boolean safe_for_kids;

    public NonFiction(){

    }

    public NonFiction(String title, boolean fiction, int pages, String genre, String time_period, boolean safe_for_kids) {
        super(title, fiction, pages);
        this.genre = genre;
        this.time_period = time_period;
        this.safe_for_kids = safe_for_kids;
    }

    //Example of Polymorphism
    @Override
    public void print(){
        System.out.println(title + " is set in the " + time_period + " .");
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getTime_period() {
        return time_period;
    }

    public void setTime_period(String time_period) {
        this.time_period = time_period;
    }

    public boolean isSafe_for_kids() {
        return safe_for_kids;
    }

    public void setSafe_for_kids(boolean safe_for_kids) {
        this.safe_for_kids = safe_for_kids;
    }

    @Override
    public String toString() {
        return "NonFiction{" +
                "genre='" + genre + '\'' +
                ", time_period='" + time_period + '\'' +
                ", safe_for_kids=" + safe_for_kids +
                '}';
    }
}
