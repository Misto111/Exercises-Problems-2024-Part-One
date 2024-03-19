import java.util.Scanner;

public class VowelsCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine().toLowerCase();

        printVowels(text);
    }

    private static void printVowels(String text) {

        int count = 0;

        for (int i = 0; i <= text.length() - 1; i++) {
            char currentSymbol = text.charAt(i);



       if (currentSymbol == 'a' || currentSymbol == 'e' || currentSymbol == 'i'
               || currentSymbol == 'o' || currentSymbol == 'u') {
            count ++;
        }


        }
        System.out.println(count);
    }
}
