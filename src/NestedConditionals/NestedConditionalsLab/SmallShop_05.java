package NestedConditionals.NestedConditionalsLab;

import java.util.Scanner;

public class SmallShop_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String product = scanner.nextLine();
        String town = scanner.nextLine();
        double count = Double.parseDouble(scanner.nextLine());
        double price = 0;
        if ("Sofia".equals(town)) {
            switch (product) {
                case "coffee":
                    price = count * 0.50;
                    System.out.println(price);
                    break;
                case "water":
                    price = count * 0.80;
                    System.out.println(price);
                    break;
                case "beer":
                    price = count * 1.20;
                    System.out.println(price);break;
                case "sweets":
                    price = count * 1.45;
                    System.out.println(price);break;
                case "peanuts":
                    price = count * 1.60;
                    System.out.println(price);
                    break;
            }
        }else if ("Plovdiv".equals(town)) {
            switch (product) {
                case "coffee":
                    price = count * 0.40;
                    System.out.println(price);break;
                case "water":
                    price = count * 0.70;
                    System.out.println(price);break;
                case "beer":
                    price = count * 1.15;
                    System.out.println(price);break;
                case "sweets":
                    price = count * 1.30;
                    System.out.println(price);break;
                case "peanuts":
                    price = count * 1.50;
                    System.out.println(price);
                    break;
            }
            }else if ("Varna".equals(town)) {
            switch (product) {
                case "coffee":
                    price = count * 0.45;
                    System.out.println(price);break;
                case "water":
                    price = count * 0.70;
                    System.out.println(price);break;
                case "beer":
                    price = count * 1.10;
                    System.out.println(price);break;
                case "sweets":
                    price = count * 1.35;
                    System.out.println(price);break;
                case "peanuts":
                    price = count * 1.55;
                    System.out.println(price);
                    break;
            }
            }

    }
}
/*
case "coffee":
        price = count * 0.50;
        System.out.println(price);
        case "water":
        price = count*0.80;
        System.out.println(price);
        case "beer":
        price = count*1.20;
        System.out.println(price);
        case "sweets":
        price=count*1.45;
        System.out.println(price);
        case "peanuts":
        price=count*1.60;
        System.out.println(price);
        break;*/
