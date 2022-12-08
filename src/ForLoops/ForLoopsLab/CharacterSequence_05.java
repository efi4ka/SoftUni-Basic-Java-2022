package ForLoops.ForLoopsLab;

import java.util.Scanner;

public class CharacterSequence_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        int lenght = name.length();

        for ( int i = 0; i <= name.length() -1; i++){
            System.out.println(name.charAt(i));

        }
    }
}
