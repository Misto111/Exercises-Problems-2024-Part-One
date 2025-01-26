package January2025;

import java.util.Arrays;

import java.util.Collections;
import java.util.List;


public class BiggestNumberInList {
    public static void main(String[] args) {


        List<Integer> numbers = Arrays.asList(5, 10, 1, 7, 3);

        // Използване на Collections.max за намиране на най-голямото число
        int maxNumber = Collections.max(numbers);

        System.out.println("Най-голямото число е: " + maxNumber);
    }
}

//        int[] numbersArray = new int[numbers.size()];
//
//        for (int i = 0; i < numbersArray.length; i++) {
//            numbersArray[i] = numbers.get(i);
//        }
//
//        Arrays.sort(numbersArray);
//        System.out.println(numbersArray[numbersArray.length - 1]);
//    }
