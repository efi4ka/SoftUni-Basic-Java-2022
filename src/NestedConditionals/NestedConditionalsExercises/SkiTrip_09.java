package NestedConditionals.NestedConditionalsExercises;

import java.util.Scanner;

public class SkiTrip_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       /* вид помещение   	  по-малко от 10 дни	    между 10 и 15 дни	        повече от 15 дни
        room for one person   не ползва намаление	    не ползва намаление	        не ползва намаление
        apartment	          30% от крайната цена 	    35% от крайната цена	    50% от крайната цена
        president apartment	  10% от крайната цена	    15% от крайната цена	    20% от крайната цена*/

        int dayOfStay = Integer.parseInt(scanner.nextLine());
        String typeOfRoom = scanner.nextLine();
        String evaluation = scanner.nextLine();

        double price = 0;
        int overnightStay = dayOfStay - 1;

        switch (typeOfRoom){
            case "room for one person":
                price = overnightStay * 18.00;
                if (evaluation.equals("positive")){
                    price = price+ price*0.25;
                }else  if (evaluation.equals("negative")){
                    price = price - price*0.1;
                }
                break;
            case "apartment":
                price = overnightStay * 25.0;
                if (dayOfStay < 10){
                    price = price-price*0.30 ;
                    if (evaluation.equals("positive")){
                        price = price + price *0.25;
                    }else if (evaluation.equals("negative")){
                        price = price - price * 0.10;
                    }
                }else if (dayOfStay <= 15){
                    price = price-price*0.35 ;
                    if (evaluation.equals("positive")){
                        price = price + price *0.25;
                    }else if (evaluation.equals("negative")){
                        price = price - price * 0.10;
                    }
                }else  if (dayOfStay > 15){
                    price = price-price*0.50 ;
                    if (evaluation.equals("positive")){
                        price = price + price *0.25;
                    }else if (evaluation.equals("negative")){
                        price = price - price * 0.10;
                    }
                }

                break;
            case "president apartment":
                price = overnightStay * 35.0;
                if (dayOfStay < 10){
                    price = price-price*0.10 ;
                    if (evaluation.equals("positive")){
                        price = price + price *0.25;
                    }else if (evaluation.equals("negative")){
                        price = price - price * 0.10;
                    }
                }else if (dayOfStay <= 15){
                    price = price-price*0.15 ;
                    if (evaluation.equals("positive")){
                        price = price + price *0.25;
                    }else if (evaluation.equals("negative")){
                        price = price - price * 0.10;
                    }
                }else  if (dayOfStay > 15){
                    price = price-price*0.20 ;
                    if (evaluation.equals("positive")){
                        price = price + price *0.25;
                    }else if (evaluation.equals("negative")){
                        price = price - price * 0.10;
                    }
                }
                break;
        }
        System.out.printf("%.2f",price);
    }
}
