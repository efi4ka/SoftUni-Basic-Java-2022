package ConditionalStatementsLab;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        int division = num % 2;
        if (division ==0){
            System.out.println("even");
        }
        else {
            System.out.println("odd");
        }
    }
}
