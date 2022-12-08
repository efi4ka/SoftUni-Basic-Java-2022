package FirstSteps.FirstStepInCodingMoreEercises;

import java.util.Scanner;

public class vegetableMarket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double priceVegetable = Double.parseDouble(scanner.nextLine());
        double priceFruit = Double.parseDouble(scanner.nextLine());
        double kilogramOnVegetables = Double.parseDouble(scanner.nextLine());
        double kilogramsOnFruits = Double.parseDouble(scanner.nextLine());

        double evro = 1.94;

        double sumVegetables = kilogramOnVegetables * priceVegetable;
        double sumFruits = kilogramsOnFruits * priceFruit;
        double allProduct = sumFruits+sumVegetables;
        System.out.format("%.2f",(allProduct/evro));

    }
}
