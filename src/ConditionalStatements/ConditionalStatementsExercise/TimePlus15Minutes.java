package ConditionalStatements.ConditionalStatementsExercise;


import java.util.Scanner;

public class TimePlus15Minutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Прочитаме входните данни
        int hours = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());
        //Превръщаме всичко в минути
        // Добавяме 15 минути
        int totalMinutes = (hours*60 +minutes)+15;
        // Пресмятаме времето - часове:минути
        int newHours = totalMinutes / 60;
        int newMinutes = totalMinutes % 60;
        if (newHours>=24){
            newHours = 0;
            System.out.printf("%d:%02d", newHours, newMinutes);
        }else{
            System.out.printf("%d:%02d", newHours,newMinutes);
        }
        // Принтираме

    }
}
