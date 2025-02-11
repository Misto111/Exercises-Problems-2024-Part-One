package februalry2025;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ReverseWorld {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] text = scanner.nextLine().split(" ");

        Collections.reverse(Arrays.asList(text));

        System.out.println(Arrays.toString(text));


    }
}
