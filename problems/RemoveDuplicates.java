package January2025;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicates {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 3 , 3, 3, 2, 1, 5, 2, 7);

        Set<Integer> set = new HashSet<>(numbers);

        System.out.println(set);
    }
}
