import java.util.Scanner;

public class OldBooks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String searchedBook = scanner.nextLine();
        String books = scanner.nextLine();

        int bookCount = 0;
        boolean isFound = false;


        while (!books.equals("No More Books")) {

            if (books.equals(searchedBook)) {
                break;

            }
            bookCount++;
            books = scanner.nextLine();
        }

        if (books.equals(searchedBook)) {
            System.out.printf("You checked %d books and found it.", bookCount);

        } else {
            System.out.println("The book you search is not here!");
            System.out.printf("You checked %d books.", bookCount);
        }


    }
}
