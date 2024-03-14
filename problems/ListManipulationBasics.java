import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListManipulationBasics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        String command = scanner.nextLine();


        while (!command.equals("end")) {
            String realCommand = command.split(" ")[0];

            if (realCommand.equals("Add")) {

                int numberToAdd = Integer.parseInt(command.split(" ")[1]);

                numbers.add(numberToAdd);

            } else if (realCommand.equals("Remove")) {

                int numberToRemove = Integer.parseInt(command.split(" ")[1]);
                numbers.remove(Integer.valueOf(numberToRemove));
                
            } else if (realCommand.equals("RemoveAt")) {

                int indexToRemove = Integer.parseInt(command.split(" ")[1]);
                numbers.remove(indexToRemove);

                
            }else if (realCommand.equals("Insert")) {

                int indexToInsert = Integer.parseInt(command.split(" ")[2]);
                int numberToInsert = Integer.parseInt(command.split(" ")[1]);

                numbers.add(indexToInsert, numberToInsert);

            }

            command = scanner.nextLine();
        }

        for (int i = 0; i < numbers.size(); i++) {

            System.out.print(numbers.get(i) + " ");

        }

    }
}
