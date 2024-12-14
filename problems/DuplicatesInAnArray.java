import java.util.*;

public class DuplicatesInAnArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array = Arrays.stream(scanner.nextLine().split(", ")).mapToInt(Integer::parseInt).toArray();

        Set<Integer> duplicates = new TreeSet<>();

        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    duplicates.add(array[i]);
                }

            }
        }
        System.out.println(duplicates);
    }
}
