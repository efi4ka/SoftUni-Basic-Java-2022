package FirstSteps.FirstStepInCodingMoreEercises;

import java.util.Scanner;

public class CircleAreaAndPerimeter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double radius = Double.parseDouble(scanner.nextLine());

        System.out.printf("%.2f" , (Math.PI * (radius*radius)));
        System.out.println();
        System.out.printf("%.2f" , (2* (Math.PI *radius)));

    }
}
