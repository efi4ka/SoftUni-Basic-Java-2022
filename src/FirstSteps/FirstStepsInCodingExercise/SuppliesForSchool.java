package FirstSteps.FirstStepsInCodingExercise;

import java.util.Scanner;

public class SuppliesForSchool {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        //Четем от конзолата
        int countPenPackets = Integer.parseInt(scanner.nextLine());
        int countHighlighters = Integer.parseInt(scanner.nextLine());
        int cleaningAgent = Integer.parseInt(scanner.nextLine());
        int discount = Integer.parseInt(scanner.nextLine());

        //Пресмятаме цената на продуктите
        //- пълна цена за химикавли
        double priceForPen = countPenPackets * 5.80;
        // - пълна цена за маркери
        double priceForHighlighters = countHighlighters * 7.20;
        // - пълна цена за препарати
        double priceForCleaningAgent = cleaningAgent * 1.20;
        // - цина за всички материали
        double SumWithoutDiscount = priceForPen + priceForHighlighters + priceForCleaningAgent;
        // - пресмятаме финалната сума  махайки намалението
        double finalSum = SumWithoutDiscount - (SumWithoutDiscount*(discount/100.0));
        //Принтираме
        System.out.println(finalSum);

    }
}
