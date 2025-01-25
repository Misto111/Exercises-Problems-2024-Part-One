package January2025;

import java.util.Arrays;
import java.util.Scanner;

public class LightestWatermelon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Въвеждане на теглата на дините
        int[] watermelons = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        // Намиране на най-леката диня
        int lightestIndex = findLightestWatermelon(watermelons);

        System.out.println("Най-леката диня е на позиция: " + lightestIndex);
    }

    public static int findLightestWatermelon(int[] watermelons) {
        int start = 0;
        int end = watermelons.length - 1;

        while (end - start > 1) {
            // Разделяме дините на три групи, ако е възможно
            int groupSize = (end - start + 1) / 3;
            int mid1 = start + groupSize - 1;
            int mid2 = mid1 + groupSize;

            // Изчисляваме теглата на трите групи
            int leftWeight = sum(watermelons, start, mid1);
            int middleWeight = sum(watermelons, mid1 + 1, mid2);
            int rightWeight = sum(watermelons, mid2 + 1, end);

            // Сравняваме теглата, за да намерим най-леката група
            if (leftWeight < middleWeight && leftWeight < rightWeight) {
                end = mid1; // Най-леката диня е в лявата група
            } else if (middleWeight < leftWeight && middleWeight < rightWeight) {
                start = mid1 + 1;
                end = mid2; // Най-леката диня е в средната група
            } else {
                start = mid2 + 1; // Най-леката диня е в дясната група
            }
        }

        // Проверяваме последните две диня
        return (watermelons[start] < watermelons[end]) ? start : end;
    }

    // Помощен метод за сумиране на елементи в масива
    private static int sum(int[] array, int start, int end) {
        int total = 0;
        for (int i = start; i <= end; i++) {
            total += array[i];
        }
        return total;
    }
}