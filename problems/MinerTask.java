import java.util.*;

public class MinerTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();

        Map<String, Integer> mapCount = new LinkedHashMap<>();

        while (!command.equals("stop")) {

            int quantity = Integer.parseInt(scanner.nextLine());

           if (!mapCount.containsKey(command)) {

               mapCount.put(command, quantity);

           }else {

               int currentQuantity = mapCount.get(command);

               mapCount.put(command, quantity + currentQuantity);

           }


            command = scanner.nextLine();


        }

        mapCount.entrySet().forEach(entry -> System.out.println(entry.getKey() + " -> " + entry.getValue()));


    }
}
