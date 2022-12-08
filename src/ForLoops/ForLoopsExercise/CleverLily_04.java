package ForLoops.ForLoopsExercise;

import java.util.Scanner;

public class CleverLily_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int age = Integer.parseInt(scanner.nextLine());
        double priceWashingMachine = Double.parseDouble(scanner.nextLine());
        int toyPrice = Integer.parseInt(scanner.nextLine());

        double sum = 0;
        int countToys = 0;

        // преминаваме през всеки рожден ден и проверяваме дали е четно или нечетно
        // пресмятаме колко пари спестява за четните рожденни дни/ колко играчки е събрала
        // пресмятаме общата сума на събраните пари
        // проверяваме дали общата сума е достатъчна, за да купим пералнята

        for (int i =1; i<=age ; i++){
            if (i%2 ==0){
               sum += i*5 -1;  //сумата може да бъде; sum=sum +(i*5-1)
            }else {
                countToys++;
            }
        }
        double finalSum = sum + countToys*toyPrice;
        double diff = Math.abs(finalSum -priceWashingMachine);

        if (finalSum >=priceWashingMachine){
            System.out.printf("Yes! %.2f",diff);
        }else {
            System.out.printf("No! %.2f",diff);
        }
    }
}
