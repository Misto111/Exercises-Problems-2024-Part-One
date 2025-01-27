package January2025;
import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {

        int[] array = {5, 1, 4, 2, 8};

        bubbleSort(array);
        System.out.println("Сортиран масив: " + Arrays.toString(array));
    }

    public static void bubbleSort(int[] array) {
        int n = array.length;

        boolean swapped;

        for (int i = 0; i < n - 1; i++) {
            swapped = false;  // Проверка дали е направена размяна в текущата итерация
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    // Размяна на съседни елементи
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    swapped = true;
                }
            }
            // Ако няма размяна, масивът вече е сортиран
            if (!swapped) {
                break;
            }
        }
    }
}
