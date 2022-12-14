package NestedConditionals.NestedConditionalsExercises;

import java.util.Scanner;

public class SummerOutfit_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int degrees = Integer.parseInt(scanner.nextLine());
        String time = scanner.nextLine();
        String outfit = "";
        String shoes = "";

        if ((degrees>=10)&&(degrees<=18)){
            switch (time){
                case "Morning":
                    outfit = "Sweatshirt";
                    shoes = "Sneakers";
                    System.out.printf("It's %d degrees, get your %s and %s.",degrees,outfit,shoes);
                    break;
                case "Afternoon":
                    outfit = "Shirt";
                    shoes = "Moccasins";
                    System.out.printf("It's %d degrees, get your %s and %s.",degrees,outfit,shoes);
                    break;
                case "Evening":
                    outfit = "Shirt";
                    shoes = "Moccasins";
                    System.out.printf("It's %d degrees, get your %s and %s.",degrees,outfit,shoes);
                    break;
            }
        }else if ((degrees > 18)&&(degrees <= 24)){
            switch (time){
                case "Morning":
                    outfit = "Shirt";
                    shoes = "Moccasins";
                    System.out.printf("It's %d degrees, get your %s and %s.",degrees,outfit,shoes);
                    break;
                case "Afternoon":
                    outfit = "T-Shirt";
                    shoes = "Sandals";
                    System.out.printf("It's %d degrees, get your %s and %s.",degrees,outfit,shoes);
                    break;
                case "Evening":
                    outfit = "Shirt";
                    shoes = "Moccasins";
                    System.out.printf("It's %d degrees, get your %s and %s.",degrees,outfit,shoes);
                    break;
            }
        }else if ( degrees>= 25){
            switch (time){
                case "Morning":
                    outfit = "T-Shirt";
                    shoes = "Sandals";
                    System.out.printf("It's %d degrees, get your %s and %s.",degrees,outfit,shoes);
                    break;
                case "Afternoon":
                    outfit = "Swim Suit";
                    shoes = "Barefoot";
                    System.out.printf("It's %d degrees, get your %s and %s.",degrees,outfit,shoes);
                    break;
                case "Evening":
                    outfit = "Shirt";
                    shoes = "Moccasins";
                    System.out.printf("It's %d degrees, get your %s and %s.",degrees,outfit,shoes);
                    break;
            }
        }
    }
}
