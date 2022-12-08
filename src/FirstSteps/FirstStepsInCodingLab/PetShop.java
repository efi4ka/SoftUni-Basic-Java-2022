package FirstSteps.FirstStepsInCodingLab;

import java.util.Scanner;

public class PetShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dogFoodPackage = Integer.parseInt(scanner.nextLine());
        int catFoodPackage = Integer.parseInt(scanner.nextLine());
        double sumForDogFoodPackage = dogFoodPackage * 2.50;
        double sumForCatFoodPackage = catFoodPackage * 4.00;
        System.out.println(sumForCatFoodPackage+sumForDogFoodPackage + " lv.");
    }
}
