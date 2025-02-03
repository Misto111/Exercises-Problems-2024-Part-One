package februalry2025;

import java.util.HashMap;
import java.util.Scanner;

public class FibonacciMemoization {

    static HashMap<Integer, Integer> memoization = new HashMap<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);



        int n = scanner.nextInt();

    }
    public static int fibonacciMemoization(int n) {
        if (n <= 1) {
            return n;
        }
        if (memoization.containsKey(n)) {
            return memoization.get(n);
        }
        int result = fibonacciMemoization(n - 1) + fibonacciMemoization(n - 2);
        memoization.put(n, result);
        return result;
    }
}
