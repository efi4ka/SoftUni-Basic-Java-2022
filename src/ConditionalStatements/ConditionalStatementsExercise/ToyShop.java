package ConditionaStatements;

import java.util.Scanner;

public class ToyShop {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        double excursionPrice = Double.parseDouble(sc.nextLine());
        int puzzles = Integer.parseInt(sc.nextLine());
        int dolls = Integer.parseInt(sc.nextLine());
        int bears = Integer.parseInt(sc.nextLine());
        int minions = Integer.parseInt(sc.nextLine());
        int trucks = Integer.parseInt(sc.nextLine());

        double totalProfit = puzzles*2.60 + dolls*3.00 + bears*4.10 + minions*8.20 + trucks*2.00;
        int toysCount = puzzles+dolls+bears+minions+trucks;
        if (toysCount>=50){
            totalProfit = totalProfit - totalProfit * 0.25;
        }
        totalProfit = totalProfit - totalProfit * 0.10;
        if (totalProfit>=excursionPrice){
            System.out.printf("Yes! %.2f lv left.", totalProfit-excursionPrice);
        }else {
            System.out.printf("Not enough money! %.2f lv needed.", excursionPrice- totalProfit);
        }
    }
}

