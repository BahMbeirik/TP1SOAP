
import client.LibraryService;
import client.Library;
import client.Book;

public class LibraryClient {
    public static void main(String[] args) {
        LibraryService service = new LibraryService();
        Library port = service.getLibraryPort();

        // إضافة كتاب
        System.out.println(port.addBook("12345", "Java Programming", "John Doe"));

        // استرجاع كتاب
        Book book = port.getBook("12345");
        if (book != null) {
            System.out.println("Book Title: " + book.getTitle());
            System.out.println("Book Author: " + book.getAuthor());
        }

        // حذف كتاب
        System.out.println(port.deleteBook("12345"));
    }
}
