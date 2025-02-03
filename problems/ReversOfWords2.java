package februalry2025;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ReversOfWords2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        String[] words = text.split("\\s+");

        List<String> wordsList = Arrays.asList(words);
        Collections.reverse(wordsList);

        //Collections.reverse(Arrays.asList(words));

        //System.out.println(Arrays.toString(words));

        System.out.println(String.join(" ", wordsList));


    }
}
