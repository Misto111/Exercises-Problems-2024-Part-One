package februalry2025;

import java.util.*;

public class MostCommonElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        Map<Integer, Integer> map = new HashMap<>();




        for (int i = 0; i < numbers.length; i++) {

            int count = map.getOrDefault(numbers[i], 0);

            map.put(numbers[i], count + 1);

        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
