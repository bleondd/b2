package exam1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FootballTeam {
    public static List<FootballPlayer> createPlayer() {
        List<FootballPlayer> team = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        for (int i = 1; i <= 11; i++) {
            System.out.println("Player " + i + " : ");
            System.out.print("Name : ");
            String name = scanner.nextLine();
            System.out.print("Height: ");
            int height = scanner.nextInt();
            System.out.print("Weight: ");
            double weight = scanner.nextDouble();
            System.out.print("Age: ");
            int age = scanner.nextInt();
            System.out.print("Shirt Number: ");
            int shirtNo = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Position: ");
            String position = scanner.nextLine();

            FootballPlayer player = new FootballPlayer(name, height, weight, age, shirtNo, position);
            team.add(player);
        }

        return team;
    }

    public static void display(List<FootballPlayer> team) {
        for (FootballPlayer player : team) {
            System.out.println("Name: " + player.name);
            System.out.println("Shirt Number: " + player.getShirtNo());
            System.out.println("Position: " + player.getPosition());
            System.out.println("Height: " + player.height);
            System.out.println("Weight: " + player.weight);
            System.out.println("Age: " + player.age);
            System.out.println("-----------------------------");
        }
    }
}

