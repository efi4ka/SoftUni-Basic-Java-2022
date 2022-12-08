package FirstSteps.FirstStepsInCodingExercise;

import java.util.Scanner;

public class FoodDelivery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberChickenMenu = Integer.parseInt(scanner.nextLine());
        int numberFishMenu = Integer.parseInt(scanner.nextLine());
        int numberVeganMenu = Integer.parseInt(scanner.nextLine());

        double priceChickenMenu = numberChickenMenu * 10.35;
        double priceFishMenu = numberFishMenu * 12.40;
        double priceVeganMenu = numberVeganMenu * 8.15;

        double sumPrice = priceVeganMenu + priceChickenMenu + priceFishMenu;
        double priceDesert = (sumPrice*0.2);
        System.out.println(sumPrice + priceDesert + 2.50);
}}