package setsAndMaps;

import java.util.*;

public class CountCharsInAString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine().replaceAll("\\s+", "");

        Map<Character, Integer> countMap = new LinkedHashMap<>();

        for (char symbol : text.toCharArray()) {

            if (!countMap.containsKey(symbol)) {
                countMap.put(symbol, 1);
            } else {
                int currentCount = countMap.get(symbol);
                countMap.put(symbol,currentCount + 1);
            }
        }

        for (Map.Entry<Character, Integer> entry : countMap.entrySet()) {

            System.out.printf("%c -> %d%n", entry.getKey(), entry.getValue());

            // countMap.entrySet().forEach(entry -> System.out.println(entry.getKey() + " -> " + entry.getValue()));
        }
    }
}
