package January2025;


public class ArrayChallenge2 {
    public static void main(String[] args) {
        int[] numbers = {1, 11, 4, 17, 13, 45, 9, 3, 7, 8, 12};

        for (int i = 0; i < numbers.length; i++) {
            int countSmaller = 0;


            for (int j = 0; j < numbers.length; j++) {
                if (numbers[j] < numbers[i]) {
                    countSmaller++;
                }
            }

            if (countSmaller == 3) {
                System.out.println("Числото с точно 3 по-малки числа е: " + numbers[i]);
                break;
            }
        }
    }
}
