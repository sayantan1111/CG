class Book {
    String title;
    String author;
    double price;
    boolean availability;

    Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.availability = true; }

    void borrowBook() {
        if (availability) {
            availability = false;
            System.out.println("Book " + title + " borrowed successfully.");
        } else {
            System.out.println("Book " + title + " is not available.");
        }
    }

    void returnBook() {
        if (!availability) {
            availability = true;
            System.out.println("Book "+title + " returned successfully.");
        } else {
            System.out.println("Book " + title + " is already available.");
        }
    }

    void displayBookDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
        System.out.println("Availability: " + (availability ? "Available" : "Borrowed"));
    }

    public static void main(String[] args) {
        Book book1 = new Book("ABC", "XYZ", 259);

        book1.displayBookDetails();

        book1.borrowBook();
        book1.displayBookDetails();

        book1.borrowBook(); 
        book1.returnBook();
        book1.displayBookDetails();

        book1.returnBook();
    }
}