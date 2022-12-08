package FirstSteps.FirstStepInCodingMoreEercises;

import javax.swing.*;
import java.util.Scanner;

public class WeatherForecast {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String WhatIsTheWether = scanner.nextLine();

        if (WhatIsTheWether.equals("sunny"))
            System.out.println("It's warm outside!");
         else
            System.out.println("It's cold outside!");


    }
}
