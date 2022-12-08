package ConditionalStatements.ConditionalStatementsMoreExercises;

import java.util.Scanner;

public class SleepyTomCat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int holidays = Integer.parseInt(scanner.nextLine());

        int freeDay = holidays*127;
        int workDay = (365 - holidays)*63;
        int timeForPlay = freeDay+workDay;

        if (timeForPlay>30000){
            int diff1 = timeForPlay - 30000;
            int hours = diff1/60;
            int minutes = diff1%60;
            System.out.println("Tom will run away");
            System.out.printf("%d hours and %d minutes more for play",hours,minutes);
        }else {
            int diff = 30000 - timeForPlay;
            int diffHours  = diff/60;
            int diffMinutes = diff%60;
            System.out.println("Tom sleeps well");
            System.out.printf("%d hours and %d minutes less for play",diffHours,diffMinutes);
        }


    }
}
