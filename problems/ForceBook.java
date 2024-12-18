package setsAndMaps;

import java.util.*;

public class ForceBook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();

        Map<String, List<String>> map = new LinkedHashMap<>();
        while (!command.equals("Lumpawaroo")) {

            if (command.contains(" | ")) {

                String group = command.split("\\s+")[0];
                String user = command.split("\\s+")[1];
                if (!map.containsKey(group)) {
                    map.put(group, new ArrayList<>());
                }
                boolean isExist = false;
                for (List<String> listUsers : map.values()) {
                    if (listUsers.contains(user)) {
                        isExist = true;
                    }
                }
                if (!isExist) {
                    map.get(group).add(user);
                }

            } else if (command.contains(" -> ")) {
                String user = command.split("\\s+\\|\\s+")[0];
                String group = command.split("\\s+\\|\\s+")[1];

                map.entrySet().forEach(entry -> entry.getValue().remove(user));

                if (map.containsKey(group)) {
                    map.get(group).add(user);
                } else {
                    map.put(group, new ArrayList<>());
                    map.get(group).add(user);
                }

                System.out.printf("%s joins the %s side!%n", user, group);
            }
            command = scanner.nextLine();
        }

        map.entrySet().stream().filter(entry -> !entry.getValue().isEmpty())
                .forEach(entry -> {
                    System.out.printf("Side: %s, Members: %d5n", entry.getKey(), entry.getValue().size());
                    entry.getValue().forEach(user -> System.out.println("! " + user));
                });
    }
}
