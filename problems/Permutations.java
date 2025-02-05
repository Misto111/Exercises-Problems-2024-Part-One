package februalry2025;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Permutations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        List<String> permutations = new ArrayList<>();
        permutations.add(String.valueOf(input.charAt(0))); // Започваме с първата буква

        for (int i = 1; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            List<String> newPermutations = new ArrayList<>();

            // За всяка текуща пермутация добавяме новия символ във всички възможни позиции
            for (String perm : permutations) {
                for (int j = 0; j <= perm.length(); j++) {
                    String newPerm = perm.substring(0, j) + currentChar + perm.substring(j);
                    newPermutations.add(newPerm);
                }
            }
            permutations = newPermutations; // Обновяваме списъка с новите пермутации
        }

        // Отпечатваме всички пермутации
        for (String perm : permutations) {
            System.out.println(perm);
        }
    }
}
