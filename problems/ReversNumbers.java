package februalry2025;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class ReversNumbers {
    public static void main(String[] args) {

        Integer[] numbers = {1, 2, 3, 4, 5};
        List<Integer> numbersList = Arrays.asList(numbers);

        Collections.reverse(Arrays.asList(numbers));
        System.out.println(Arrays.toString(numbers));
//
//        for (int i = numbers.length - 1; i >= 0 ; i--) {
//            System.out.print(numbers[i] + " ");
//
//        }

    }
}
