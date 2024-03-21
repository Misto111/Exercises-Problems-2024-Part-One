import java.util.ArrayDeque;
import java.util.Scanner;

public class HotPotato {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String [] children = scanner.nextLine().split("\\s+");
        int turns = Integer.parseInt(scanner.nextLine());

        ArrayDeque<String> queue = new ArrayDeque<>();

        for (int i = 0; i < children.length; i++) {

            queue.offer(children[i]);
        }

        while (queue.size() != 1) {
            for (int i = 1; i < turns; i++) {
                String currentChild = queue.poll();
                queue.offer(currentChild);

            }
            String childrenToRemove = queue.poll();
            System.out.println("Removed " + childrenToRemove);
        }
        String lastChild = queue.peek();
        System.out.printf("Last is %s", lastChild);
     }
}
