package ConditionalStatements.ConditionalStatementsExercise;

import java.util.Scanner;

public class GodzilaKingkong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double filmBudget = Double.parseDouble(scanner.nextLine());
        int countStatist = Integer.parseInt( scanner.nextLine());
        double priceCoutStatist = Double.parseDouble(scanner.nextLine());

        double priceForDecor = filmBudget*0.1;
        if (countStatist>150){
            priceCoutStatist = priceCoutStatist-priceCoutStatist*0.1;
        }

        double sumCout = countStatist * priceCoutStatist;
        double filmSum = priceForDecor+sumCout;
        double remainingAmount = filmBudget - filmSum;
        if (filmSum>filmBudget){
            System.out.println("Not enough money!");
            System.out.printf("Wingard needs %.2f leva more.", Math.abs(remainingAmount));
        }
        else if (filmSum<=filmBudget){
            System.out.println("Action!");
            System.out.printf("Wingard starts filming with %.2f leva left.", remainingAmount);
        }
    }
}
