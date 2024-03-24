package salaryIncrease;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfPeople = Integer.parseInt(scanner.nextLine());

        List<Person> people = new ArrayList<>();

        for (int i = 0; i < numberOfPeople; i++) {

            String[] peopleData = scanner.nextLine().split("\\s+");
            String firstName = peopleData[0];
            String lastName = peopleData[1];
            int age = Integer.parseInt(peopleData[2]);
            double salary = Double.parseDouble(peopleData[3]);

            Person person = new Person(firstName, lastName, age, salary);
            people.add(person);

        }
        double increase = Double.parseDouble(scanner.nextLine());

        for (Person person : people) {

            person.increaseSalary(increase);

            System.out.println(person.toString());
        }
    }
}
