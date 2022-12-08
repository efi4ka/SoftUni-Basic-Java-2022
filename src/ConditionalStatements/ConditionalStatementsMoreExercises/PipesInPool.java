package ConditionalStatements.ConditionalStatementsMoreExercises;

import java.util.Scanner;

public class PipesInPool {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int volumeV = Integer.parseInt(scanner.nextLine());
        int debitP1 = Integer.parseInt(scanner.nextLine());
        int debitP2 = Integer.parseInt(scanner.nextLine());
        double hours = Double.parseDouble(scanner.nextLine());

        double P1 =(debitP1 * hours);
        double P2 = (debitP2 * hours);
        double volumeP2P1 = P1+P2;
        double fullPool = (volumeP2P1/volumeV)*100;
        double procentP1 = (P1/volumeP2P1)*100;
        double procentP2 = (P2/volumeP2P1)*100;
        double litriOver = volumeP2P1-volumeV;
        if (volumeV>=volumeP2P1){
          System.out.printf("The pool is %.2f%% full. Pipe 1: %.2f%%. Pipe 2: %.2f%%.", fullPool, procentP1, procentP2);

        }else  if (volumeV<=volumeP2P1){
            System.out.printf("For %.2f hours the pool overflows with %.2f liters.", hours, litriOver);
        }

    }
}
