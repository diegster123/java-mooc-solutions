
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("File: ");
        String file = scan.nextLine();
        ArrayList<Teams> teams = readFile(file);

        System.out.println("Name: ");
        String teamChoice = scan.nextLine();

        int i, wins, losses;
        i = losses = wins = 0;

        for (Teams team : teams) {
            int score1 = team.getCt();
            int score2 = team.getT();
            if (teamChoice.contains(team.getTeamOne())) {
                i++;
                if (score1 > score2) {
                    wins++;
                } else {
                    losses++;
                }
            }
            if (teamChoice.contains(team.getTeamTwo())) {
                i++;
                if (score2 > score1) {
                    wins++;
                } else {
                    losses++;
                }
            }
        }
        System.out.println("Games: " + i);
        System.out.println("Wins: " + wins);
        System.out.println("Losses: " + losses);;
    }

    public static ArrayList<Teams> readFile(String file) {
        ArrayList<Teams> teams = new ArrayList<>();
        try ( Scanner scan = new Scanner(Paths.get(file))) {
            while (scan.hasNextLine()) {
                String line = scan.nextLine();

                String[] parts = line.split(",");
                String team1 = parts[0];
                String team2 = parts[1];
                int ct = Integer.valueOf(parts[2]);
                int t = Integer.valueOf(parts[3]);

                teams.add(new Teams(team1, team2, ct, t));
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        return teams;
    }
}

