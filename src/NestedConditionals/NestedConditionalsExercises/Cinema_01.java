package NestedConditionals.NestedConditionalsExercises;

import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class Cinema_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String typeProjection = scanner.nextLine();
        int rows = Integer.parseInt(scanner.nextLine());
        int colums = Integer.parseInt(scanner.nextLine());
        double income = 0.0;

        if (typeProjection.equals("Premiere")){
            income = rows * colums * 12.00;
        }else if (typeProjection.equals("Normal")){
            income = rows * colums* 7.50;
        }else if (typeProjection.equals("Discount")){
            income = rows * colums * 5.00;
        }
        System.out.printf("%.2f", income);

    }
}
