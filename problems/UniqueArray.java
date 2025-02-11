package februalry2025;

import com.sun.source.tree.ArrayAccessTree;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class UniqueArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array = Arrays.stream(scanner.nextLine().split(", ")).mapToInt(Integer::parseInt).toArray();

        Set<Integer> set = new HashSet<>();

        boolean isUnique = false;

        for (int i = 0; i < array.length; i++) {
            if (set.contains(array[i])) {
                isUnique = true;
            } else {
                set.add(array[i]);
            }

        }

        System.out.println(isUnique);
    }
}
