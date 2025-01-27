package January2025;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountRepeatingNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        // Прочитане на числата като вход
        System.out.println("Въведете числата, разделени с интервал:");
        int[] input = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        // Речник за броене на числата
        Map<Integer, Integer> counts = new HashMap<>();

        // Броене на всяко число
        for (int num : input) {

            counts.put(num, counts.getOrDefault(num, 0) + 1);
        }

        // Печат на резултата
        for (Map.Entry<Integer, Integer> entry : counts.entrySet()) {
            if (entry.getValue() <= 1) {
                System.out.println(entry.getKey() + " -> " + entry.getValue() + " път");
            } else {
                System.out.println(entry.getKey() + " -> " + entry.getValue() + " пъти");
            }
        }
    }
}

