package NestedConditionals.NestedConditionalsExercises;

import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class Journey_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();

        String destinatination = "";
        String accommodationType = "";
        double price = 0;

        if (budget <= 100) {
            destinatination = "Bulgaria";
            if (season.equals("summer")) {
                accommodationType = "Camp";
                price = budget * 0.3;
            } else if (season.equals("winter")) {
                accommodationType = "Hotel";
                price = budget * 0.7;
            }

        } else if (budget <= 1000) {
            destinatination = "Balkans";
            if (season.equals("summer")) {
                accommodationType = "Camp";
                price = budget * 0.4;
            } else if (season.equals("winter")) {
                accommodationType = "Hotel";
                price = budget * 0.8;
            }
            }else {
            destinatination = "Europe";
            accommodationType = "Hotel";
            price = budget * 0.9;

        }
        System.out.printf("Somewhere in %s%n", destinatination);
        System.out.printf("%s - %.2f", accommodationType, price);

    }
}
