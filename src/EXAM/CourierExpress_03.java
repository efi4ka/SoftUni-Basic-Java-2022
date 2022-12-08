package EXAM;

import java.util.Scanner;

public class CourierExpress_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double weightInKg = Double.parseDouble(scanner.nextLine());
        String serviceType = scanner.nextLine();
        int distance = Integer.parseInt(scanner.nextLine());

        double costDeliveryForKm = 0.0;
        double sum = 0.0;
        double discount = 0.0;


        if (weightInKg >= 1 && weightInKg <= 10) {
            costDeliveryForKm = 0.05;
            if (serviceType.equals("express")) {
                discount = (costDeliveryForKm * 0.40);
            }
        }else if (weightInKg > 11 && weightInKg <= 40){
                costDeliveryForKm = 0.10;
                if (serviceType.equals("express")){
                    discount = (costDeliveryForKm * 0.05);
                }
            }else if (weightInKg > 41 && weightInKg <= 90){
                costDeliveryForKm = 0.15;
                if (serviceType.equals("express")){
                    discount = (costDeliveryForKm*0.02);
                }
            }else  if (weightInKg >= 91 && weightInKg <=150){
                costDeliveryForKm = 0.20;
                if (serviceType.equals("express")){
                    discount = costDeliveryForKm *0.01;
                }
            }else if (weightInKg<1){
                costDeliveryForKm = 0.03;
                if (serviceType.equals("express")){
                    discount = costDeliveryForKm * 0.80;
                }
            }
        sum  = costDeliveryForKm* distance;
        double diff = weightInKg * discount;
        double total = diff * distance;
        double totalCost = total + diff;
        System.out.printf("The delivery of your shipment with weight of %.3f kg. would cost %.2f lv.",weightInKg,totalCost);
        }

    }




