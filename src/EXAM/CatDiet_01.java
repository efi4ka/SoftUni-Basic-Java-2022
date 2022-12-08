package EXAM;

import java.util.Scanner;

public class CatDiet_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int fatPercentage = Integer.parseInt(scanner.nextLine());
        int proteinPercentage = Integer.parseInt(scanner.nextLine());
        int carbohydratesPercentage = Integer.parseInt(scanner.nextLine());
        int totalCalories = Integer.parseInt(scanner.nextLine());
        int percentageOfWaterCauntent = Integer.parseInt(scanner.nextLine());

        double totalGramFat = (totalCalories * fatPercentage / 100.0)/ 9.0;
        double totalGramProtein = (totalCalories * proteinPercentage/100.0)/ 4.0;
        double totalgramCarbohydrates = (totalCalories * carbohydratesPercentage / 100.0) / 4.0;

        double foodWeight = totalGramFat + totalGramProtein + totalgramCarbohydrates;
        double caloriesForGramFood =  totalCalories / foodWeight;
        double waterPercent = (100 - percentageOfWaterCauntent) / 100.0;
         double caloriesInGram = caloriesForGramFood * waterPercent;

        System.out.printf("%.4f", caloriesInGram);

    }
}
