package FirstSteps.FirstStepsInCodingExercise;

import java.util.Scanner;

public class Repainting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int needNylon = Integer.parseInt(scanner.nextLine());
        int needPaint = Integer.parseInt(scanner.nextLine());
        int amountDiluent = Integer.parseInt(scanner.nextLine());
        int hour = Integer.parseInt(scanner.nextLine());
        double bag = 0.40;
        double amountNylon = (needNylon + 2)* 1.50 ;
        double amountPaint = (needPaint + (needPaint* 0.1)) * 14.50;
        double sumDiluent = amountDiluent* 5.00;

        double sumMaterials = sumDiluent+ amountNylon + amountPaint + bag;
        double discountMaterials = sumMaterials * 0.3;
        double sumMasters = discountMaterials * hour;
        System.out.println(sumMaterials+sumMasters);



    }
}
