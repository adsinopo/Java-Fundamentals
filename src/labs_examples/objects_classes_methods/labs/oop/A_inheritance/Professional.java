package labs_examples.objects_classes_methods.labs.oop.A_inheritance;

public class Professional extends Athlete{
    private String league;
    private String college;
    private int years_experience;
    private boolean olympian;

    public Professional(){

    }

    public Professional(String name, int age, int weight, double height, String league, String college, int years_experience, boolean olympian) {
        super(name, age, weight, height);
        this.league = league;
        this.college = college;
        this.years_experience = years_experience;
        this.olympian = olympian;
    }

    public void introduction(){
        System.out.println("Professional Athlete...");
    }

    public String getLeague() {
        return league;
    }

    public void setLeague(String league) {
        this.league = league;
    }

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }

    public int getYears_experience() {
        return years_experience;
    }

    public void setYears_experience(int years_experience) {
        this.years_experience = years_experience;
    }

    public boolean isOlympian() {
        return olympian;
    }

    public void setOlympian(boolean olympian) {
        this.olympian = olympian;
    }
}
