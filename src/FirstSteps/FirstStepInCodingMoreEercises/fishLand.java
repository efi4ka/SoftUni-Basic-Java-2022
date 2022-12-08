package FirstSteps.FirstStepInCodingMoreEercises;

import java.util.Scanner;

public class fishLand {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double priceMackerel = Double.parseDouble(scanner.nextLine());
        double priceSprinkle = Double.parseDouble(scanner.nextLine());
        double quantityPalamud = Double.parseDouble(scanner.nextLine());
        double quantitySafrid = Double.parseDouble(scanner.nextLine());
        double quantityMidi = Double.parseDouble(scanner.nextLine());

        double pricePalamud = priceMackerel + (priceMackerel*0.6);
        double priceSafrid = priceSprinkle + (priceSprinkle* 0.8);
        double priceMidi = 7.50;

        double sumPalamud = quantityPalamud*pricePalamud;
        double sumSafrid = quantitySafrid*priceSafrid;
        double sumMidi = quantityMidi*priceMidi;
        System.out.printf("%.2f", sumMidi+sumSafrid+sumPalamud);


    }
}
