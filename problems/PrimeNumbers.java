package January2025;

public class PrimeNumbers {
    public static void main(String[] args) {
        System.out.println("Простите числа от 1 до 100 са:");

        for (int number = 2; number <= 100; number++) {
            if (isPrime(number)) {
                System.out.print(number + " ");
            }
        }
    }

    // Метод за проверка дали едно число е просто
    public static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false; // Ако има делител, числото не е просто
            }
        }

        return true;
    }
}
