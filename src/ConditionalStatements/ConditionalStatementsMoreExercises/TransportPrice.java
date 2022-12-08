package ConditionalStatements.ConditionalStatementsMoreExercises;

import java.util.Scanner;

public class TransportPrice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int km = Integer.parseInt(scanner.nextLine());
        String dayOrNight = scanner.nextLine();

        double firstTax = 0.70;
        double taxiDayLvForKm = 0.79;
        double taxiNightLvForKm = 0.90;
        double busLvForKm = 0.09;
        double trainLvForKm = 0.06;

        double priceTaxyDay = firstTax + (km * taxiDayLvForKm);
        double priceTaxiNight = firstTax + (km * taxiNightLvForKm);
        double priceBus = km * busLvForKm;
        double priceTrain = km * trainLvForKm;

        if (km < 20 && dayOrNight.equals("day")){
            System.out.printf("%.2f",priceTaxyDay);
        }else if (km <= 20 && dayOrNight.equals("night")){
            System.out.printf("%.2f", priceTaxiNight);
        }else if ( km <100 ){
            System.out.printf("%.2f", priceBus);
        }else if (km>100){
            System.out.printf("%.2f",priceTrain);
        }






    }
}
