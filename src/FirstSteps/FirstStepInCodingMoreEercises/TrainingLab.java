package FirstSteps.FirstStepInCodingMoreEercises;

import java.util.Scanner;

public class TrainingLab {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double w = sc.nextDouble();
        double h = sc.nextDouble();

        double wToCm = w * 100;
        int wCm = (int)wToCm;
        double hToCm = h * 100;
        int hCm = (int) hToCm;
        int freeH = hCm - 100;

        int deskInARow = freeH/70;
       int countDesk = wCm/120;
        System.out.println(deskInARow*countDesk-3);
    }
}
