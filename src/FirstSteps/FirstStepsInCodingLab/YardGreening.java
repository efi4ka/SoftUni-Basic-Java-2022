package FirstSteps.FirstStepsInCodingLab;

import java.util.Scanner;

public class YardGreening {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Double areaGreening = Double.parseDouble(scanner.nextLine());
        double priceWithoutDiscount = areaGreening * 7.61;
        double discount = priceWithoutDiscount * 0.18;
        double finalPrice =priceWithoutDiscount - discount;

        System.out.println("The final price is: " + finalPrice + " lv.");
        System.out.println("The discount is: " + discount + " lv.");


    }
}
