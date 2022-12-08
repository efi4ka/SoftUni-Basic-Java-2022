package NestedConditionals.NestedConditionalsExercises;

import java.util.Scanner;

public class NewHouse_03 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        String flowers = scanner.nextLine();
        int countFlowers = Integer.parseInt(scanner.nextLine());
        int budget= Integer.parseInt(scanner.nextLine());
        double price = 0.0;

        switch (flowers){
            case "Roses":
                price = countFlowers * 5;
                if (countFlowers>80){
                    price = price - price *0.1;
                }
                break;
            case "Dahlias":
                price = countFlowers * 3.80;
                if (countFlowers>90){
                price = price - price *0.15;
            }
                break;
            case "Tulips":
                price = countFlowers * 2.80;
                if (countFlowers>80){
                    price = price - price *0.15;
                }
                break;
            case "Narcissus":
                price = countFlowers * 3.0;
                if (countFlowers < 120){
                    price = price + price *0.15;
                }
                break;
            case "Gladiolus":
                price = countFlowers * 2.50;
                if (countFlowers<80){
                    price = price + price *0.20;
                }
                break;

        }
       double diff = budget-price;
            if (budget>=price){
                System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.",countFlowers,flowers,Math.abs(diff));
            }
            else {
                System.out.printf("Not enough money, you need %.2f leva more.",Math.abs(diff));
            }
    }
}
