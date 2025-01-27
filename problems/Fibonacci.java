package January2025;

public class Fibonacci {
    public static void main(String[] args) {

        int n = 7;

        System.out.println("n-тото число от Фибоначи е: " + fibonacci(n));

    }
    public static int fibonacci(int n) {

        if (n <= 1) {
            return n;
        }
        int a = 0, b = 1, c = 0;
        for (int i = 2; i <= n; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        return c;
    }
}
