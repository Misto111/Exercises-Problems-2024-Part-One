package setsAndMaps;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class UserLogs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Map<String, Map<String, Integer>> data = new TreeMap<>();

        while (!input.equals("end")) {
            String[] inputParts = input.split("\\s+");

            String ip = inputParts[0].split("=")[1];
            String message = inputParts[1].split("=")[1];
            String username = inputParts[2].split("=")[1];

            if (!data.containsKey(username)) {
                data.put(username, new LinkedHashMap<>(){{
                    put(ip, 1);
                }});

            } else {
                Map<String, Integer> currentIps = data.get(username);

                if (currentIps.containsKey(ip)) {
                    int currentTimes = currentIps.get(ip);
                    currentIps.put(ip, currentTimes + 1);

                } else {
                    currentIps.put(ip, 1);
                }
            }

            input = scanner.nextLine();
        }

        data.keySet().forEach(username -> {
            System.out.println(username + ":");
            Map<String, Integer> ips = data.get(username);
            ips.entrySet().forEach(entry -> {
                System.out.println(entry.getKey() + " => " + entry.getValue() + ", ");
            });
        });
    }
}
