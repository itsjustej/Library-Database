import java.util.ArrayList;

public class BookDatabase {
    private ArrayList<Book> books;

    public void BookDatabase() {
        this.books = new ArrayList<>();
    }

    public void BookDatabase(ArrayList<Book> books) {
        this.books = new ArrayList<>(books);
    }

    public void setBooks(ArrayList<Book> books) {
        this.books = new ArrayList<>(books);
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void removeBook(Book book) {
        books.remove(book);


    }

}