package februalry2025;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MostCommonCharacterInString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        Map<Character, Integer> map = new HashMap<>();

        for (char c : text.toCharArray()) {
            if (c == ' ') {

                continue;
            }

            map.put(c, map.getOrDefault((c), 0) + 1);
        }

        char mostCommonChar = ' ';
        int count = 0;

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() > count) {
                mostCommonChar = entry.getKey();
                count = entry.getValue();
            }

        }

        System.out.println("The most common char is: '" + mostCommonChar + "', it meets " + count + " times.");

    }
}
