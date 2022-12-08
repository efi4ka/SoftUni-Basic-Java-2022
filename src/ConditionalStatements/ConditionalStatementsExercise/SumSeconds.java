package ConditionalStatements.ConditionalStatementsExercise;

import java.util.Scanner;

public class SumSeconds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int timeFirst = Integer.parseInt(scanner.nextLine());
        int timeSecond = Integer.parseInt(scanner.nextLine());
        int timeThird = Integer.parseInt(scanner.nextLine());

        int sumTime  = timeFirst + timeSecond + timeThird;
        int minutes = sumTime / 60;
        int secunds = sumTime % 60;

        if (secunds<10){
            System.out.printf("%d:0%d", minutes, secunds);
        }
        else {
            System.out.printf("%d:%d", minutes , secunds);
        }

    }
}



