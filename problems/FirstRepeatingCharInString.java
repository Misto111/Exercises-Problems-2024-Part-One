package februalry2025;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class FirstRepeatingCharInString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        Set<Character> seenChars = new HashSet<>();

        for (char c : text.toCharArray()) {
            if (seenChars.contains(c)) {
                System.out.println(c);
                return;
            }
            seenChars.add(c);
        }
        System.out.println("Non repeating characters");

    }
}

