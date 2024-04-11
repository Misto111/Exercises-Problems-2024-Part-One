package builderDP;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\s+");

        String name = input[0];
        String number = input[1];
        String company = input[2];
        String title = input[3];

        Contact contact = new Contact(name,number).withCompany(company).withTitle(title);

        System.out.println(contact.toString());
    }
}
