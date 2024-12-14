package setsAndMaps;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class UniqueUsernames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countUsernames = Integer.parseInt(scanner.nextLine());
        Set<String> uniqueUsernames = new LinkedHashSet<>();

        for (int i = 1; i <= countUsernames; i++) {
            String username = scanner.nextLine();
            uniqueUsernames.add(username);
        }

        uniqueUsernames.forEach(System.out::println);
//        for (String username : uniqueUsernames) {
//            System.out.println(username);
//        }
    }
}
