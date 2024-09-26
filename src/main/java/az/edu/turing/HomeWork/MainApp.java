package az.edu.turing.HomeWork;

import java.util.ArrayList;
import java.util.List;

public class MainApp {
    public static void main(String[] args) {
        List<Player> playerList = new ArrayList<>();
        playerList.add(new Player(1, "Aysel", 21, 89.0, true));
        playerList.add(new Player(3, "Semmed", 19, 90.0, false));
        playerList.add(new Player(4, "Leyla", 20, 87.0, true));
        playerList.add(new Player(5, "Nurcan", 19, 87.0, true));
        playerList.add(new Player(6, "Turqut", 20, 93.0, false));

        playerList.sort(new Player());


        for (Player player : playerList) {
            System.out.println(player);
        }

    }
}
