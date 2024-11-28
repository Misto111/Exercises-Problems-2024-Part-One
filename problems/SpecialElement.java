package cycles;

import java.util.Arrays;
import java.util.Scanner;

public class SpecialElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int[] elements = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();


        Arrays.sort(elements);

        if (elements.length > 3) {
            int specialElement = elements[3];
            System.out.println("Числото, за което точно 3 числа са по-малки, е: " + specialElement);
        } else {
            System.out.println("Няма достатъчно елементи в масива.");
        }

    }

}

