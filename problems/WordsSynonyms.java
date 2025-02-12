package setsAndMaps;
import java.util.*;

public class WordsSynonyms {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Map<String, List<String>> wordsSynonyms = new LinkedHashMap<>();

          for (int i = 0; i < n; i++) {

            String word = scanner.nextLine();
            String synonym = scanner.nextLine();

            wordsSynonyms.putIfAbsent(word, new ArrayList<>());
            wordsSynonyms.get(word).add(synonym);

        }

        for (Map.Entry<String, List<String>> entry : wordsSynonyms.entrySet()) {

            System.out.printf("%s - %s%n", entry.getKey(),String.join(", ", entry.getValue()));
        }

    }
}
