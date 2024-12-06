package com.epam.rd.autotasks;

import java.util.Arrays;

class CycleSwap {
    public static void main(String[] args) {
        int[] array1 = new int[]{1, 3, 2, 7, 4};
        cycleSwap(array1);
        System.out.println(Arrays.toString(array1));

        int[] array2 = new int[]{1, 3, 2, 7, 4};
        cycleSwap(array2, 2);
        System.out.println(Arrays.toString(array2));

        int[] array3 = new int[]{1, 3, 2, 7, 4};
        cycleSwap(array3, 5);
        System.out.println(Arrays.toString(array3));
    }

    static void cycleSwap(int[] array) {
        if (array == null || array.length == 0) {
            return;
        }
        int lastElement = array[array.length - 1];
        for (int i = array.length - 1; i > 0; i--) {
            array[i] = array[i - 1];
        }
        array[0] = lastElement;
    }

    static void cycleSwap(int[] array, int shift) {
        if (array == null || array.length == 0 || shift <= 0) {
            return;
        }
        shift = shift % array.length;
        if (shift == 0) {
            return;
        }

        int[] temp = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            temp[(i + shift) % array.length] = array[i];
        }

        System.arraycopy(temp, 0, array, 0, array.length);
    }
}
