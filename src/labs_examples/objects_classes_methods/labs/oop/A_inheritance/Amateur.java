package labs_examples.objects_classes_methods.labs.oop.A_inheritance;

public class Amateur extends Athlete {
    private String college;
    private String sport;
    private boolean pro_potential;
    private String position;

    public Amateur(){

    }

    public Amateur(String name, int age, int weight, double height, String college, String sport, boolean pro_potential, String position) {
        super(name, age, weight, height);
        this.college = college;
        this.sport = sport;
        this.pro_potential = pro_potential;
        this.position = position;
    }

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }

    public String getSport() {
        return sport;
    }

    public void setSport(String sport) {
        this.sport = sport;
    }

    public boolean isPro_potential() {
        return pro_potential;
    }

    public void setPro_potential(boolean pro_potential) {
        this.pro_potential = pro_potential;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @Override
    public String toString() {
        return "Amateur{" +
                "college='" + college + '\'' +
                ", sport='" + sport + '\'' +
                ", pro_potential=" + pro_potential +
                ", position='" + position + '\'' +
                '}';
    }
}
