package setsAndMaps;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class ParkingLot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Set<String> parkingLot = new LinkedHashSet<>();
        String input = scanner.nextLine();

        while (!input.equals("END")) {
            String[] parts = input.split(", ");

            String command = parts[0];
            String regNumber = parts[1];

            if (command.equals("IN")) {
                parkingLot.add(regNumber);
            } else if (command.equals("OUT")) {
                parkingLot.remove(regNumber);
            }

            input = scanner.nextLine();
        }

        if (parkingLot.isEmpty()) {
            System.out.println("Parking Lot is Empty");
        }

        for (String regNumber : parkingLot) {
            System.out.println(regNumber);
        }

    }
}
