package com.epam.rd.autotasks.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LocalMaximaRemove {

    public static void main(String[] args) {
        int[] array = new int[]{18, 1, 3, 6, 7, -5};

        System.out.println(Arrays.toString(removeLocalMaxima(array)));
    }

    public static int[] removeLocalMaxima(int[] array) {

        List<Integer> resultList = new ArrayList<>();


        for (int i = 0; i < array.length; i++) {
            if (i == 0 && array[i] <= array[i + 1]) {
                resultList.add(array[i]);
            }

            else if (i == array.length - 1 && array[i] <= array[i - 1]) {
                resultList.add(array[i]);
            }

            else if (i > 0 && i < array.length - 1 &&
                    !(array[i] > array[i - 1] && array[i] > array[i + 1])) {
                resultList.add(array[i]);
            }
        }

        int[] result = new int[resultList.size()];
        for (int i = 0; i < resultList.size(); i++) {
            result[i] = resultList.get(i);
        }

        return result;
    }
}