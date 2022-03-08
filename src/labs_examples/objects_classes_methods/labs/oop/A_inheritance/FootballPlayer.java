package labs_examples.objects_classes_methods.labs.oop.A_inheritance;

public class FootballPlayer extends Professional{
    private String position;
    private String team;
    private int pro_bowls;
    private int mvp_awards;

    public FootballPlayer(){

    }

    public FootballPlayer(String name, int age, int weight, double height, String league, String college,
                          int years_experience, boolean olympian, String position, String team, int pro_bowls, int mvp_awards) {
        super(name, age, weight, height, league, college, years_experience, olympian);
        this.position = position;
        this.team = team;
        this.pro_bowls = pro_bowls;
        this.mvp_awards = mvp_awards;
    }

    @Override
    public void introduction(){
        System.out.println("Football Player " + name);
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

    public int getPro_bowls() {
        return pro_bowls;
    }

    public void setPro_bowls(int pro_bowls) {
        this.pro_bowls = pro_bowls;
    }

    public int getMvp_awards() {
        return mvp_awards;
    }

    public void setMvp_awards(int mvp_awards) {
        this.mvp_awards = mvp_awards;
    }

    @Override
    public String toString() {
        return "FootballPlayer{" +
                "position='" + position + '\'' +
                ", team='" + team + '\'' +
                ", pro_bowls=" + pro_bowls +
                ", mvp_awards=" + mvp_awards +
                '}';
    }
}
