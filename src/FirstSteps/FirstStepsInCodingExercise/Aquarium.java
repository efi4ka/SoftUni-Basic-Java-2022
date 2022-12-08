package FirstSteps.FirstStepsInCodingExercise;

import java.util.Scanner;

public class Aquarium {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Четем от конзолата - дължина, широчина, височина и процент
        int length = Integer.parseInt(scanner.nextLine());
        int wight = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());
        double percent = Double.parseDouble(scanner.nextLine());
        // пресмятаме обема на аквариума
        int volume = length*wight*height;
        // пресмятаме обема в литри
        double fullTankLiters = volume*0.001;
        // Пресмятоме колко литри са ни нужни ( пълни литри  * (1-0,17))
        double needenLiters = fullTankLiters*(1-(percent/100));
        // Принтиране
        System.out.println(needenLiters);


    }
}
