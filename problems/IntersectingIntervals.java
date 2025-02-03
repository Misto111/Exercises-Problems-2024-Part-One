package februalry2025;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class IntersectingIntervals {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       int[][] intervals = { {1, 5}, {6, 10}, {4, 8}};

        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));

        boolean hasOverlap = false; // Флаг за пресичане

        for (int i = 0; i < intervals.length - 1; i++) {
            int currentEnd = intervals[i][1];
            int nextStart = intervals[i + 1][0];

            if (currentEnd > nextStart) {
                System.out.println("Пресичане: " + Arrays.toString(intervals[i]) + " и " + Arrays.toString(intervals[i + 1]));
                hasOverlap = true;
            }

        }
        if (!hasOverlap) {
            System.out.println("Няма пресичащи се интервали.");
        }

    }
}
