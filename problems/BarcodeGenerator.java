import jdk.jshell.SourceCodeAnalysis;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BarcodeGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int startNumber = Integer.parseInt(scanner.nextLine());
        int endNumber = Integer.parseInt(scanner.nextLine());

        int startUnits = startNumber % 10;
        int startTens = startNumber /10  % 10;
        int startHundreds = startNumber /100  % 10;
        int startThousands = startNumber /1000;

        int endUnits = endNumber % 10;
        int endTens = endNumber /10  % 10;
        int endHundreds = endNumber /100  % 10;
        int endThousands = endNumber /1000;

        for (int i = startNumber; i <= endNumber; i++) {

            int inits = i % 10;
            int tens = i / 10 % 10;
            int hundreds = i / 100 % 10;
            int thousands = i / 1000;

            if (inits % 2 != 0 && tens % 2 != 0 && hundreds % 2 != 0 && thousands % 2 != 0){

                if (inits >= startUnits && inits <= endUnits && tens >= startTens && tens <= endTens && hundreds >= startHundreds
                        && hundreds <= endHundreds && thousands >= startThousands && thousands <= endThousands){

                    System.out.print(i + " ");

                }



            }


        }

    }
}




