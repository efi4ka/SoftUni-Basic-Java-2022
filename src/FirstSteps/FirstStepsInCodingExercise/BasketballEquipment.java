package FirstSteps.FirstStepsInCodingExercise;

import java.util.Scanner;

public class BasketballEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int annualTraningFee = Integer.parseInt(scanner.nextLine());

        double priceSneakers = annualTraningFee - (annualTraningFee * 0.4);
        double priceSportOutfit = priceSneakers - (priceSneakers * 0.20);
        double priceBall = priceSportOutfit * 0.25;
        double priceAccesori = priceBall * 0.2;
        System.out.println(priceAccesori + priceBall + priceSneakers + priceSportOutfit + annualTraningFee);

    }}




