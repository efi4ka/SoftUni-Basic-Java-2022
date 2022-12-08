package EXAM;

import java.util.Scanner;

public class ExcursionSale_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int seaCount = Integer.parseInt(scanner.nextLine());
        int moutainCount = Integer.parseInt(scanner.nextLine());
        int seaPrice = 680;
        int mountainPrice = 499;

        double profit = 0.0;

        while (true) {
            String packegName = scanner.nextLine();

            if (packegName.equals("Stop")){
            System.out.println("Good job! Everything is sold.");
            }
            else if (packegName.equals("sea") && seaCount != 0){
                profit += seaPrice;
                seaCount--;
            }
            else if (packegName.equals("mountain")  && moutainCount != 0)
            {
                profit += mountainPrice;
                moutainCount--;
            }

            if (seaCount == 0)
                if (moutainCount == 0)
                    break;

            if (moutainCount == 0)
                if (seaCount == 0)
                    break;
        }

        System.out.printf("Profit: %.2f leva.",profit);
    }
}


