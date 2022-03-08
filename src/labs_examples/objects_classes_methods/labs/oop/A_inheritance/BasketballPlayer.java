package labs_examples.objects_classes_methods.labs.oop.A_inheritance;

public class BasketballPlayer extends Professional{
    private String position;
    private String team;
    private boolean starter;
    private int all_stars;
    private int mvp_awards;

    public BasketballPlayer() {

    }

    public BasketballPlayer(String name, int age, int weight, double height, String league, String college,
                            int years_experience, boolean olympian, String position, String team, boolean starter, int all_stars, int mvp_awards) {
        super(name, age, weight, height, league, college, years_experience, olympian);
        this.position = position;
        this.team = team;
        this.starter = starter;
        this.all_stars = all_stars;
        this.mvp_awards = mvp_awards;
    }

    @Override
    public void introduction(){
        System.out.println("Basketball Player " + name);
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public boolean isStarter() {
        return starter;
    }

    public void setStarter(boolean starter) {
        this.starter = starter;
    }

    public int getAll_stars() {
        return all_stars;
    }

    public void setAll_stars(int all_stars) {
        this.all_stars = all_stars;
    }

    public int getMvp_awards() {
        return mvp_awards;
    }

    public void setMvp_awards(int mvp_awards) {
        this.mvp_awards = mvp_awards;
    }

    @Override
    public String toString() {
        return "BasketballPlayer{" +
                "position='" + position + '\'' +
                ", team='" + team + '\'' +
                ", starter=" + starter +
                ", all_stars=" + all_stars +
                ", mvp_awards=" + mvp_awards +
                '}';
    }
}
