package ForLoops.ForLoopsExercise;

import java.util.Scanner;

public class Salary_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
// прочитаме брой отворени табове, заплата
// прочитаме името на сайта
        int n = Integer.parseInt(scanner.nextLine());
        int salary = Integer.parseInt(scanner.nextLine());

        for (int tabs =1; tabs<=n; tabs++){
            String curentWebsite = scanner.nextLine();

            switch (curentWebsite){
                case "Facebook":
                    salary -= 150;
                    break;
                case "Instagram":
                    salary -= 100;
                    break;
                case "Reddit":
                    salary -= 50;
                    break;
            }
            if (salary<=0){
                System.out.println("You have lost your salary.");
                break;
            }
        }
        if (salary>0){
            System.out.println(salary);
        }
    }
}
