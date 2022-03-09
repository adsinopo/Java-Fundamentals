package labs_examples.objects_classes_methods.labs.oop.B_polymorphism;

public class Nascar implements Pace{
    String driver;
    String sponsor;
    int number;
    int mph;

    public Nascar(){

    }
    public Nascar(String driver, String sponsor, int number) {
        this.driver = driver;
        this.sponsor = sponsor;
        this.number = number;
    }

    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }

    public String getSponsor() {
        return sponsor;
    }

    public void setSponsor(String sponsor) {
        this.sponsor = sponsor;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Nascar{" +
                "driver='" + driver + '\'' +
                ", sponsor='" + sponsor + '\'' +
                ", number=" + number +
                '}';
    }

    @Override
    public void speedUp(int a) {
        mph += a;
    }

    @Override
    public void slowDown(int b) {
        mph -= b;
    }
    public void currentSpeed(){
        System.out.println(driver + " is going " + mph + " mph");
    }
}
