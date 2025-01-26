package January2025;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class RemoveRepeatingNumbersFromList {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 2, 3, 3, 4);

        Set<Integer> setNumbers = new HashSet<>(numbers);

        for (Integer number : setNumbers) {
            if (number == setNumbers.size()) {
                System.out.print(number);
                return;
            }
            System.out.print(number + ", ");
        }

        //System.out.println(setNumbers);


    }
}
