package OrderByAge;

import javax.imageio.plugins.jpeg.JPEGImageReadParam;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        List<Person> people = new ArrayList<>();

        while (true) {
            String command = scanner.nextLine();
            if (command.equals("End")) {
                break;

            } else {

                String name = command.split("\\s+")[0];
                String id = command.split("\\s+")[1];
                int age = Integer.parseInt(command.split("\\s+")[2]);

                Person person = new Person(name, id, age);

                people.add(person);


            }


        }
        people.sort(Comparator.comparing(Person::getAge));

        for (Person person : people) {
            System.out.println(person.toString());

        }
    }
}