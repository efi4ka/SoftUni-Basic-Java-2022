package EXAM;

import java.util.Scanner;

public class DeerOfSanta {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int day = Integer.parseInt(scanner.nextLine());
        int kg = Integer.parseInt(scanner.nextLine());
        double foodForDay1Deer  = Double.parseDouble(scanner.nextLine());
        double foodForDay2Deer = Double.parseDouble(scanner.nextLine());
        double foodForDay3Deer = Double.parseDouble(scanner.nextLine());

        double needFood1Deer = day * foodForDay1Deer;
        double needFood2Deer = day * foodForDay2Deer ;
        double needFood3Deer = day * foodForDay3Deer;
        double totalNeedFood = needFood1Deer + needFood2Deer + needFood3Deer;
        double diff = Math.abs(kg-totalNeedFood);
        if (totalNeedFood <= kg){
            System.out.printf("%.0f kilos of food left.",Math.floor(diff));
        }else {
            System.out.printf("%.0f more kilos of food are needed.", Math.ceil(diff));
        }
    }
}
