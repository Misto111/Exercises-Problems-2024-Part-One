package februalry2025;

import java.util.Scanner;

public class LongestCommonPrefixSubstring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");

        if (input.length == 0) {
            System.out.println("Empty String");
            return;
        }


        String prefix = input[0];

        for (int i = 1; i < input.length; i++) {
                while (input[i].indexOf(prefix) != 0) {
                    prefix = prefix.substring(0, prefix.length() - 1);
                    if (prefix.isEmpty()) {
                        System.out.println("");
                        return;
                    }
                }

        }
        System.out.println(prefix);
    }
}
