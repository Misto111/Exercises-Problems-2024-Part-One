import java.util.ArrayDeque;
import java.util.Scanner;

public class BrowserHistory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<String> history = new ArrayDeque<>();

        String input = scanner.nextLine();
        String currentUrl = "";

        while (!input.equals("Home")) {

            if (input.equals("back")) {

                if (history.size() > 1) {
                    history.pop();
                    currentUrl = history.peek();
                    System.out.println(currentUrl);
                }else {

                    System.out.println("no previous URLs");
                }


            }else {

                history.push(input);
                currentUrl = history.peek();
                System.out.println(currentUrl);

            }
            input = scanner.nextLine();
        }
    }
}
