//Import Scanner
import java.util.Scanner;

public class WhatToWear {
    public static void main(String[] arg){
    // WEATHER
    //prompt user for an input
        System.out.println("What is the weather like?");
    // input weather
        Scanner weatherInput = new Scanner(System.in);
        String weather = weatherInput.nextLine();

    //TEMP
    //prompt user for an input
        System.out.println("What is the current average temperature?");
   // input temperature
        Scanner tempInput = new Scanner(System.in);
        int temperature = tempInput.nextInt();


        // test this OR addition: || "wet" || "raining" || "damp"

        //IF rainy or cold
        if (weather.equals("rainy") || temperature < 20){
            System.out.println("You should bring a jacket!");
        }
        //If sunny or hot
        else if (weather.equals("sunny") && temperature > 20){ // NOTE: user entry is space/caps sensitive
            System.out.println("You should wear a hat or put on some sunscreen!");
        }

    }

}
