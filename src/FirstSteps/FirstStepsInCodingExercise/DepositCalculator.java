package FirstSteps.FirstStepsInCodingExercise;

import java.util.Scanner;

public class DepositCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Прочитаме от конзолата входните данни
        double depositAmount = Double.parseDouble(scanner.nextLine());
        int months = Integer.parseInt(scanner.nextLine());
        double interestRate =Double.parseDouble(scanner.nextLine());

        // Пресмятаме стойносста за месец
        double profitPerMonth = depositAmount*(interestRate/100) /12 ;

        //Пресмятаме цялата сума за всички месеци
        double totalSum = depositAmount + months *profitPerMonth;

        // Принтиране от конзолата
        System.out.println(totalSum);
    }
}
