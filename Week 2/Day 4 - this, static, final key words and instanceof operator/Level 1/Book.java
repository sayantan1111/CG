public class Book {

    public static String libraryName = "Central Library";
    private final String isbn;
    private String title;
    private String author;

    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    public static void displayLibraryName() {
        System.out.println("Library Name: " + libraryName);
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getIsbn() {
        return isbn;
    }

    public void displayBookDetails() {
        System.out.println("Title: " + this.title);
        System.out.println("Author: " + this.author);
        System.out.println("ISBN: " + this.isbn);
    }

    public static void main(String[] args) {
        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald", "978-0743273565");
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee", "978-0061120084");

        System.out.println("Library Name (from book1): " + book1.libraryName);
        System.out.println("Library Name (from book2): " + book2.libraryName);
        Book.displayLibraryName();

        System.out.println("\nBook 1 Details:");
        if (book1 instanceof Book) {
            book1.displayBookDetails();
        }

        System.out.println("\nBook 2 Details:");
        if (book2 instanceof Book) {
            book2.displayBookDetails();
        }

        Book.libraryName = "City Public Library";
        System.out.println("\nLibrary Name after change (from book1): " + book1.libraryName);
        System.out.println("Library Name after change (from book2): " + book2.libraryName);
        Book.displayLibraryName();
    }
}