package labs_examples.objects_classes_methods.labs.oop.A_inheritance;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class AthleteController {

    public static void main(String[] args) {

        //player2 is a variable of type football player
        //variable declaration
        FootballPlayer player2;
        FootballPlayer footballPlayer = new FootballPlayer("Tom Brady", 43, 200, 74.0, "NFL", "Michigan",
                22, false, "Quarterback",
                "Buccaneers", 15, 3);

        BasketballPlayer basketballPlayer = new BasketballPlayer("MJ", 59, 216, 78.0, "NBA", "North Carolina", 16, true,
                "Shooting Guard", "Bulls", true, 14, 5);

        System.out.println(footballPlayer.getName() + " " + footballPlayer.getPosition() + " " + footballPlayer. getTeam()
        + " " + footballPlayer.getMvp_awards());
        footballPlayer.introduction();


        System.out.println(basketballPlayer.getName() + " " + basketballPlayer.getPosition() + " " + basketballPlayer. getTeam()
                + " " + basketballPlayer.getMvp_awards());
        basketballPlayer.introduction();

        //variable definition
        player2 = new FootballPlayer();
    }
}
