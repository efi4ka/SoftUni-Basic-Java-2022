package FirstSteps.FirstStepsInCodingLab;

import java.util.Scanner;

public class ProjectsCreation {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        String nameofArchitect = scanner.nextLine();
        int countProjects = Integer.parseInt(scanner.nextLine());
        int timeForProjects = countProjects*3;

        System.out.println("The architect " + nameofArchitect + " will need " + timeForProjects + " hours to complete " + countProjects + " project/s. ");
    }
}
