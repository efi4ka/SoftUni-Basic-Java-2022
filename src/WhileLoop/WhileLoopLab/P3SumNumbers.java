package WhileLoop.WhileLoopLab;

import java.util.Scanner;

public class P3SumNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        int sum = 0;

        while (sum<number){
            int curentNumber = Integer.parseInt(scanner.nextLine());
            sum += curentNumber;
        }
        System.out.println(sum);
    }
}
