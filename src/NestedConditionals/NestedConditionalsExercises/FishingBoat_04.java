package NestedConditionals.NestedConditionalsExercises;

import java.util.Scanner;

public class FishingBoat_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int budget = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        int countFisher = Integer.parseInt(scanner.nextLine());
        double rentShip = 0;
        double price = 0.0;
        double discount = 0;

        if ( countFisher % 2 == 0 ){

            if (countFisher >= 4 && countFisher <= 6){
                discount = 0.15;
            }
            if ( countFisher>6 && countFisher <= 11){
                discount = 0.2;
            }
            if (countFisher >= 12 && countFisher <= 18){
                discount =0.3;}
        }else {
            if (countFisher >= 4 && countFisher <= 6) {
                discount = 0.1;
            }
            if (countFisher > 6 && countFisher <= 11) {
                discount = 0.15;
            }
            if (countFisher >= 12 && countFisher <= 18) {
                discount = 0.25;
            }
        }

        switch (season){
            case "Spring":
                rentShip = 3000;

                break;
            case "Summer":
                rentShip = 4200;


                break;
            case"Autumn":
                rentShip = 4200;

                break;
            case "Winter":
                rentShip = 2600;

        }
        if(season .equals("Autumn")){
            if (countFisher % 2 == 0 ){
                discount = discount-0.05;
            }
        }
        price = rentShip - rentShip*discount;
        double total = Math.abs(budget - price);
        if (budget>price){
            System.out.printf("Yes! You have %.2f leva left.%n",total);
        }else {
            System.out.printf("Not enough money! You need %.2f leva.",total);
        }
}}



