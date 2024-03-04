import java.util.Scanner;

public class ProjectCreation {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        int projectsNum = Integer.parseInt(scanner.nextLine());

        int totalHours = projectsNum * 3;

        System.out.printf("The architect %s will need %d hours to complete %d project/s.", name, totalHours, projectsNum);
    }
}
