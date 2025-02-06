package februalry2025;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class UniqueSymbolsInString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();

        Set<Character> uniqueSymbols = new LinkedHashSet<>();

        boolean isUnique = true;

        for (char c : text.toCharArray()) {
            if (!uniqueSymbols.contains(c)) {
                uniqueSymbols.add(c);
            } else {
                isUnique = false;

            }
        }
        System.out.println(isUnique ? "true" : "false");
    }
}
