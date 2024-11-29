package cycles;

import java.util.*;

public class Anagram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] inputStrings = scanner.nextLine().split(",");

        List<Character> input = new ArrayList<>();
        for (String str : inputStrings) {
            str = str.trim();
            if (!str.isEmpty()) {
                input.add(str.charAt(0));
            }
        }


        char[] array = new char[input.size()];
        for (int i = 0; i < input.size(); i++) {
            array[i] = input.get(i);
        }

        Set<String> results = new HashSet<>();

        generatePermutations(array, 0, results);

        System.out.println("Всички уникални анаграми:");
        for (String permutation : results) {
            System.out.println(permutation);
        }
    }

    private static void generatePermutations(char[] array, int index, Set<String> results) {
        if (index == array.length) {
            results.add(new String(array));
            return;
        }

        for (int i = index; i < array.length; i++) {
            swap(array, index, i);

            generatePermutations(array, index + 1, results);


            swap(array, index, i);
        }
    }

    private static void swap(char[] array, int i, int j) {
        char temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}