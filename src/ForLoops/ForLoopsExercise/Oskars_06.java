package ForLoops.ForLoopsExercise;

import java.util.Scanner;

public class Oskars_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nameActor = scanner.nextLine();
        double academyPoints = Double.parseDouble(scanner.nextLine());
        int countExaminers = Integer.parseInt(scanner.nextLine());

        double sumAllPoints = academyPoints;

        for (int i = 1 ; i <= countExaminers ;  i++){
            String examinersName = scanner.nextLine();
            double pointsExaminers = Double.parseDouble(scanner.nextLine());

            double curentPoints = (examinersName.length() * pointsExaminers)/2;
            sumAllPoints +=curentPoints;

            if (sumAllPoints>=1250.50){
                System.out.printf("Congratulations, %s got a nominee for leading role with %.1f!",nameActor,sumAllPoints);
                break;
            }

        }
        if (sumAllPoints<1250.5){
            double diff = 1250.50 - sumAllPoints;
            System.out.printf("Sorry, %s you need %.1f more!",nameActor,diff);

        }
    }
}
