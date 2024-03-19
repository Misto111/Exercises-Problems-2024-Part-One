import java.text.DecimalFormat;
import java.util.*;
import java.util.stream.Collectors;

public class CountRealNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Double> numbers =Arrays.stream(scanner.nextLine().split("\\s+")).map(Double::parseDouble).collect(Collectors.toList());

        Map<Double, Integer> mapCounter = new TreeMap<>();

        for (double num : numbers) {

            if (!mapCounter.containsKey(num)) {
                mapCounter.put(num, 1);

                //mapCounter.put(num, 0);


            }else {

                int occurrences = mapCounter.get(num);
                occurrences++;
                mapCounter.put(num, occurrences);

                // mapCounter.put(num, mapCounter.get(num) + 1);

            }



        }
        for (Map.Entry<Double, Integer> entry : mapCounter.entrySet()) {
            DecimalFormat df = new DecimalFormat("#.#######");
            System.out.printf("%s -> %d%n", df.format(entry.getKey()), entry.getValue());

        }


    }
}
