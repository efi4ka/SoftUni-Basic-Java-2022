package ForLoops.ForLoopsExercise;

import java.util.Scanner;

public class TennisRanklist_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countTurnaments = Integer.parseInt(scanner.nextLine());
        int initialPoints = Integer.parseInt(scanner.nextLine());

        int sumPoints = initialPoints;
        int countWins = 0;

        for (int i = 1; i<= countTurnaments; i++ ){
            String tournamentsStage = scanner.nextLine();

            if (tournamentsStage.equals("W")) {
                sumPoints += 2000;
                countWins++;
            } else if (tournamentsStage.equals("F")) {
                sumPoints += 1200;
            } else if (tournamentsStage.equals("SF")) {
                sumPoints += 720;
            }
        }

        int tournamentsPoints = sumPoints - initialPoints;
        double percentWinsTournaments = (1.0*countWins/countTurnaments) *100;

        System.out.printf("Final points: %d%n",sumPoints);
        System.out.printf("Average points: %d%n", tournamentsPoints/countTurnaments);
        System.out.printf("%.2f%%",percentWinsTournaments);
    }
}
