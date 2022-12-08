package FirstSteps.FirstStepInCodingMoreEercises;

import java.util.Scanner;

public class HousePaiting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double heightInTheHouseX = Double.parseDouble(scanner.nextLine());
        double sidewallLengthY = Double.parseDouble(scanner.nextLine());
        double heightTriangleH = Double.parseDouble(scanner.nextLine());
        double expensePaintGreen = 3.40;
        double expensePaintRed = 4.30;

        double areaWindow = 1.5*1.5;
        double areaEntrance = 1.2*2;
        double areaRectangle = 2*((heightInTheHouseX*sidewallLengthY)-areaWindow);
        double areaSquare = (2* (heightInTheHouseX*heightInTheHouseX))- areaEntrance;
        System.out.printf("%.2f", (areaRectangle+areaSquare)/expensePaintGreen);
        System.out.println( );

        double areaRectangleRoof = 2 * (sidewallLengthY*heightInTheHouseX);
        double areaTriangleRoof = 2 * (heightInTheHouseX*heightTriangleH/2);
        System.out.printf("%.2f", (areaRectangleRoof + areaTriangleRoof)/expensePaintRed);

    }
}
