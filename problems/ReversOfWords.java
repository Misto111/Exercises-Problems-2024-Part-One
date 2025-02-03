package februalry2025;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ReversOfWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] word = scanner.nextLine().split(" ");

        Collections.reverse(Arrays.asList(word));

        System.out.println(Arrays.toString(word));

    }
}
