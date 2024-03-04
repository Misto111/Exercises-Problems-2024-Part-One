import java.util.Scanner;

public class Cake {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int width = Integer.parseInt(scanner.nextLine());
        int length = Integer.parseInt(scanner.nextLine());

        int numberOfPieces = width * length;

        int piecesCount = 0;

        String command = scanner.nextLine();
        while (!command.equals("STOP")) {
            int pieces = Integer.parseInt(command);
            piecesCount += pieces;

            if (numberOfPieces < piecesCount) {
                break;

            }
            command = scanner.nextLine();
        }


        if (piecesCount <= numberOfPieces) {

            int difference = Math.abs(numberOfPieces - piecesCount);
            System.out.printf("%d pieces are left.", difference);
        } else {
            int difference = Math.abs(piecesCount - numberOfPieces);
            System.out.printf("No more cake left! You need %d pieces more.", difference);

        }


    }
}
