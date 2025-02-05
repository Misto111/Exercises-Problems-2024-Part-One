package februalry2025;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StringCompression {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine().replaceAll("\\s+", "");

        Map<Character, Integer> map = new HashMap<>();

        for(char c : text.toCharArray()){

            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            System.out.print(entry.getKey() + "" + entry.getValue());
        }

    }
}
