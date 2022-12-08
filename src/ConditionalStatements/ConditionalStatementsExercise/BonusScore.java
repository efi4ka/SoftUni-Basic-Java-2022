package ConditionalStatements.ConditionalStatementsExercise;

import java.util.Scanner;

public class BonusScore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    // Четем от конзолата
        int number = Integer.parseInt(scanner.nextLine());
        double bonus = 0.0;
    // проверка в кой диапазон е числото
        if (number<=100){
            bonus = 5;
        }else if (number<=1000){
            bonus = number*0.2;
        }else {
            bonus = number*0.1;
        }
    //Пресмятаме бонус точките
        if (number%2 ==0){
            bonus = bonus + 1;
        }else if (number%10 == 5){
            bonus = bonus +2;
        }
        double sum = number+bonus;
        System.out.printf("%.1f%n", bonus);
        System.out.printf("%.1f%n", sum);
    //Принтираме
    }
}
