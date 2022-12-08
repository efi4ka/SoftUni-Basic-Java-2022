package FirstSteps.FirstStepsInCodingLab;

import java.util.Scanner;

public class InchesToCentimeters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // прочитаме входни данни подадени от потребителя
        double inches = Double.parseDouble(scanner.nextLine());

        //Пресмятане
        double centimeters = inches * 2.54;

        //Принтиране на резултата
        System.out.println(centimeters);

    }
}
