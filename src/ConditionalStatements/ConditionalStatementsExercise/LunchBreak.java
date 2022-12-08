package ConditionalStatements.ConditionalStatementsExercise;

import java.util.Scanner;

public class LunchBreak {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nameOfMovie = scanner.nextLine();
        int episodDuration = Integer.parseInt(scanner.nextLine());
        int lunchBrakeDuration = Integer.parseInt(scanner.nextLine());
        double timeForEat = lunchBrakeDuration/8.0;
        double timeForRest = lunchBrakeDuration/4.0;
        double timeForWach = lunchBrakeDuration - timeForEat - timeForRest;
        if (timeForWach >= episodDuration){
            System.out.printf("You have enough time to watch %s and left with %.0f minutes free time.", nameOfMovie,Math.ceil(timeForWach-episodDuration));
        } else {
            System.out.printf("You don't have enough time to watch %s, you need %.0f more minutes.", nameOfMovie,Math.ceil(episodDuration-timeForWach));
        }


    }
}
