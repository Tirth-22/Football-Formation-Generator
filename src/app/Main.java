package app;

import java.util.Scanner;
import model.Player;
import service.FormationAdvisior;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("---  Welcome! Your Team Formation Generator  ---");
        System.out.println("1. Group Stage Match");
        System.out.println("2. Knock out Match");
        System.out.println("3. Final Match");
        System.out.println("4. Exit");
        int matchType = sc.nextInt();
        sc.nextLine();

        Player[] team = new Player[11];

        System.out.println("\nEnter Your 11 players and their position like");
        System.out.println("(GK,LB,RB,CB,LM,RM,CM,CAM,ST,CF,LW,RW)\n");
        for (int i = 0; i < 11; i++) {
            System.out.print("Player " + (i + 1) + " name is : ");
            String name = sc.nextLine();

            System.out.print("Player " + (i + 1) + " Position is : ");
            String position = sc.nextLine();

            team[i] = new Player(name, position);
        }

        String suggestion = FormationAdvisior.advise(matchType, team);

        System.out.println("\nSuggested Formation : ");
        System.out.println(suggestion);
    }
}
