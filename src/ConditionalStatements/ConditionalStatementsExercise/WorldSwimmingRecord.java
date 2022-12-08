package ConditionalStatements.ConditionalStatementsExercise;

import java.util.Scanner;

public class WorldSwimmingRecord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Четем от конзолата
        double currentRecors = Double.parseDouble(scanner.nextLine());
        double distanse = Double.parseDouble(scanner.nextLine());
        double timeForMeter = Double.parseDouble(scanner.nextLine());
        //Пресмятаме забавянето
        double delayZabawqne =Math.floor((distanse/15))*12.5;
        //Пресмятаме времето, за което плува
        double result = (distanse * timeForMeter)+delayZabawqne;
        //Проверка дали е постигнал нов световен рекорт
        if (currentRecors>result){
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.", result);
        }
        else {
            double diff = result-currentRecors;
            System.out.printf("No, he failed! He was %.2f seconds slower.", diff);
        }
    }
}
