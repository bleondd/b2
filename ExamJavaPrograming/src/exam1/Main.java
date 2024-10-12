package exam1;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<FootballPlayer> team = FootballTeam.createPlayer();
        FootballTeam.display(team);
    }
}
