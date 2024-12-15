package setsAndMaps;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FixEmails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, String> emails = new HashMap<>();
        String name = scanner.nextLine();

        while (!name.equals("stop")) {
            String email = scanner.nextLine();

            if (!email.endsWith("uk") && !email.endsWith("us") && !email.endsWith("com")) {
                emails.put(name, email);
            }
            name = scanner.nextLine();
        }

        emails.forEach((key, value) -> System.out.println(key + " -> " + value));
        //emails.entrySet().forEach(entry -> System.out.println(entry.getKey() + " -> " + entry.getValue()));
    }
}
