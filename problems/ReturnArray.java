package January2025;

import java.util.Arrays;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ReturnArray {
    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5, 6};


        List<Integer> list = Arrays.stream(array).boxed().collect(Collectors.toList());

        Collections.reverse(list);

        System.out.println(list);
    }
}

