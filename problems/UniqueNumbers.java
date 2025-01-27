package January2025;

import java.util.*;
import java.util.stream.Collectors;

public class UniqueNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        Set<Integer> uniqueNums =  (uniqueNumbers(numbers));

        System.out.println(String.join(" ",
                uniqueNums.stream().map(String::valueOf).collect(Collectors.toList())));
    }

    public static Set<Integer> uniqueNumbers(List<Integer> numbers) {
        Set<Integer> uniqueNumbers = new HashSet<>();
        Set<Integer> duplicates = new HashSet<>();

        for (Integer number : numbers) {
            if (!uniqueNumbers.add(number)) {
                duplicates.add(number);
            }

        }
        uniqueNumbers.removeAll(duplicates);
        return uniqueNumbers;
    }
}
