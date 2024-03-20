import java.util.*;

public class CountCharsInAString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        Map<Character, Integer> countMap = new LinkedHashMap<>();

        for (int i = 0; i < text.length(); i++) {

            char current = text.charAt(i);

            if (current == ' ') {
                continue;

            } else {

                countMap.putIfAbsent(current, 0);
                countMap.put(current, countMap.get(current) + 1);
            }

        }

        for (Map.Entry<Character, Integer> entry : countMap.entrySet()) {

            System.out.printf("%c -> %d%n", entry.getKey(), entry.getValue());

            // countMap.entrySet().forEach(entry -> System.out.println(entry.getKey() + " -> " + entry.getValue()));

        }

    }
}
