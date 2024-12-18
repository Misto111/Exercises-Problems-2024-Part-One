package setsAndMaps;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class WordsCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] text = scanner.nextLine().split("\\s+");

        Map<String, Integer> wordCounts = new LinkedHashMap<>();

        for (String word : text) {

//            if (word.endsWith(".")) {
//                word = word.substring(0, word.length() - 1).toLowerCase();
//            }

            word = word.replaceAll("\\p{Punct}", "").toLowerCase();

            wordCounts.put(word, wordCounts.getOrDefault(word, 0) + 1);

//            if (!map.containsKey(word)) {
//               map.put(word, 1);
//            } else {
//                int currentCount = map.get(word);
//                map.put(word, currentCount + 1);
//            }
        }
       wordCounts.forEach((key, value) -> System.out.println(key + ": " + value));
    }
}
