import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RepeatString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String repeatWord = scanner.nextLine();
        int count = Integer.parseInt(scanner.nextLine());

        System.out.println(printRepeatString(repeatWord, count)); ;
    }

    private static String printRepeatString(String repeatWord, int count) {
        String repeatWords = "";
        for (int i = 0; i < count; i++) {

              repeatWords += repeatWord;


        }
        return repeatWords;
    }
}
