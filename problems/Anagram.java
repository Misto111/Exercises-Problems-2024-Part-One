
import java.util.Arrays;
import java.util.Scanner;


public class Anagram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String word1 = scanner.nextLine();
        String word2 = scanner.nextLine();

        System.out.println(areAnagram(word1, word2));
    }

    public static boolean areAnagram(String word1, String word2) {
        if (word1.length() != word2.length()) {
            return false;
        }
        char[] word1Array = word1.toCharArray();
        char[] word2Array = word2.toCharArray();

        Arrays.sort(word1Array);
        Arrays.sort(word2Array);

        return Arrays.equals(word1Array, word2Array);
    }
}
