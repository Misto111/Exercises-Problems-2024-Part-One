package January2025.Books;

public class Main {
    public static void main(String[] args) {

        Book book1 = new Book("Dogi", "Hachi", 25);
        Book book2 = new Book("Logy", "Hachi", 30);

        Book[] books = {book1, book2};

        for (Book book : books) {
            System.out.println(book.toString());
        }

    }
}
