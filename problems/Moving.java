import java.util.Scanner;

public class Moving {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int width = Integer.parseInt(scanner.nextLine());
        int length = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());

        int volume = width * length * height;
        int sumVolumeOfBoxes = 0;

        String command = scanner.nextLine();

        while (!command.equals("Done")) {
            int numBoxes = Integer.parseInt(command);

            sumVolumeOfBoxes += numBoxes;

            if (volume < sumVolumeOfBoxes) {
                break;
            }

            command = scanner.nextLine();
        }

        if (sumVolumeOfBoxes <= volume) {

            int freeSpace = Math.abs(volume - sumVolumeOfBoxes);

            System.out.printf("%d Cubic meters left.", freeSpace);

        } else {

            int noFreeSpace = Math.abs(sumVolumeOfBoxes - volume);
            System.out.printf("No more free space! You need %d Cubic meters more.", noFreeSpace);
        }
    }
}

        /*10
        10
        2
        20
        20
        20
        20
        122*/
