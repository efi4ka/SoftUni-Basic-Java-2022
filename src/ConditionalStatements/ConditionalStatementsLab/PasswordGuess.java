package ConditionalStatementsLab;

import java.util.Scanner;

public class PasswordGuess {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String pInsertPassword = scanner.nextLine();
        if (pInsertPassword.equals("s3cr3t!P@ssw0rd")){
            System.out.println("Welcome");
        }
        else {
            System.out.println("Wrong password!");
        }

    }
}
