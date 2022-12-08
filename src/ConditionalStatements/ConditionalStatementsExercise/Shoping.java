package ConditionalStatements.ConditionalStatementsExercise;

import java.util.Scanner;

public class Shoping {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double PeterBudget = Double.parseDouble(scanner.nextLine());
        int numberVideoCard = Integer.parseInt(scanner.nextLine());
        int numberProcesors = Integer.parseInt(scanner.nextLine());
        int numberRam = Integer.parseInt(scanner.nextLine());

        double priceVideoCard = 250.0;
        double sumVideoCard = numberVideoCard*priceVideoCard;
        double sumProcesor = numberProcesors*(sumVideoCard*0.35);
        double sumRam = numberRam*(sumVideoCard*0.1);
        double totalSum = sumRam + sumProcesor + sumVideoCard;
        if (numberVideoCard>numberProcesors){
            totalSum = totalSum -totalSum*0.15;
        }
        if (totalSum<= PeterBudget){
            System.out.printf("You have %.2f leva left!", PeterBudget-totalSum);
        }else  if (totalSum>PeterBudget){
            System.out.printf("Not enough money! You need %.2f leva more!", totalSum-PeterBudget);
        }
    }
}
