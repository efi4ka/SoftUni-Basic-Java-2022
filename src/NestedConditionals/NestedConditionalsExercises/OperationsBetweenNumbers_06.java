package NestedConditionals.NestedConditionalsExercises;

import java.util.Scanner;

public class OperationsBetweenNumbers_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N1 = Integer.parseInt(scanner.nextLine());
        int N2 = Integer.parseInt(scanner.nextLine());
        String operator = scanner.nextLine();

        switch (operator){
            case "+":
                int sum = N1 + N2;
                if (sum %2 ==0){
                    System.out.printf("%d + %d = %d - even",N1, N2, sum);
                }else
                    System.out.printf("%d +  %d = %d – odd",N1, N2, sum);
                break;
            case "-":
                int diff = N1 -N2;
                if (diff % 2 ==0){
                    System.out.printf("%d - %d = %d - even", N1, N2, diff);
                }else {
                    System.out.printf("%d - %d = %d - odd", N1, N2, diff);
                }
                break;
            case "*":
                int result = N1 * N2;
                if (result % 2 == 0){
                    System.out.printf("%d * %d = %d - even", N1, N2, result);
                }else {
                    System.out.printf("%d * %d = %d - odd", N1, N2, result);
                }
                break;
            case "/":
                if (N2 == 0){
                    System.out.printf("Cannot divide %d by zero", N1);
                }else {
                    double division = N1 * 1.0 / N2;
                    System.out.printf("%d / %d = %.2f", N1,N2, division);
                }
                break;
            case"%":
                if (N2 == 0){
                    System.out.printf("Cannot divide %d by zero", N1);
                }else {
                    int leftover = N1 % N2;
                    System.out.printf("%d %% %d = %d", N1, N2, leftover);
                }
                break;
        }
    }
}
