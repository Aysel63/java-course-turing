package az.edu.turing.HomeWork;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class MainApp {
    public static void main(String[] args) {
        List<Player> playerList = new ArrayList<>();
        playerList.add(new Player(1, "Aysel", 21, 89.0, true));
        playerList.add(new Player(3, "Semmed", 19, 90.0, false));
        playerList.add(new Player(4, "Leyla", 20, 87.0, true));
        playerList.add(new Player(5, "Nurcan", 19, 87.0, true));
        playerList.add(new Player(6, "Turqut", 20, 93.0, false));


        playerList.sort(Comparator.comparing(Player::getScore).reversed()
                .thenComparing(Player::getFemale)
                .thenComparingInt(Player::getAge)
                .thenComparing(Player::getName).reversed()
                .thenComparingInt(Player::getId));


        playerList.forEach(System.out::println);

    }
}
