package FirstSteps.FirstStepsInCodingExercise;

import java.util.Scanner;

public class VacationBooksList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfPage = Integer.parseInt(scanner.nextLine());
        int pageForHour = Integer.parseInt(scanner.nextLine());
        int numberOfDays = Integer.parseInt(scanner.nextLine());

        int totalTimeForReadTheBook = numberOfPage / pageForHour;
        int needHourPerDay = totalTimeForReadTheBook / numberOfDays;
        System.out.println(needHourPerDay);


    }


}
