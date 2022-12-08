package FirstSteps.FirstStepsInCodingLab;

import java.util.Scanner;

public class RectangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //прочитане на входни данни
        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());

        // пресмятане на лицето на
        int Area = a*b;

        //Принтиране на резултата
        System.out.println(Area);
    }
}
