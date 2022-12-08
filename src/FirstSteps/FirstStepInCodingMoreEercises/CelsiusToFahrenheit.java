package FirstSteps.FirstStepInCodingMoreEercises;

import java.util.Scanner;

public class CelsiusToFahrenheit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double temperatureInCelsius = Double.parseDouble(scanner.nextLine());
        double temperatureInFahrenhait = (temperatureInCelsius*1.80)+32.00;
        System.out.format("%.2f", temperatureInFahrenhait);

    }
}
