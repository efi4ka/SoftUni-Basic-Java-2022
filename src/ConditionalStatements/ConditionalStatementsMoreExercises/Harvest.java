package ConditionalStatements.ConditionalStatementsMoreExercises;

import java.util.Scanner;

public class Harvest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int areaKvM = Integer.parseInt(scanner.nextLine());
        double grapeFromKvM = Double.parseDouble(scanner.nextLine());
        int neededWine = Integer.parseInt(scanner.nextLine());
        int numberOfWorkers = Integer.parseInt(scanner.nextLine());

        double totalGrapes =(areaKvM * grapeFromKvM);
        double wine = ((totalGrapes*0.4)/2.5);
        double lack = neededWine-wine;
        double remainingWine = wine-neededWine;
        double wineForWorkers = remainingWine/numberOfWorkers;

        if (wine < neededWine){
            System.out.printf("It will be a tough winter! More %.0f liters wine needed.", Math.floor(lack) );
        }else if (wine >= neededWine){
            System.out.printf("Good harvest this year! Total wine: %.0f liters.\n", Math.floor(wine));
            System.out.printf("%.0f liters left -> %.0f liters per person.",Math.ceil(remainingWine), Math.ceil(wineForWorkers) );
        }

    }
}
