class Book {
    private String title;
    private int publicationYear;

    public Book(String title, int publicationYear) {
        this.title = title;
        this.publicationYear = publicationYear;
    }

    public String getTitle() {
        return title;
    }

    public int getPublicationYear() {
        return publicationYear;
    }
}

class Author extends Book {
    private String name;
    private String bio;

    public Author(String title, int publicationYear, String name, String bio) {
        super(title, publicationYear);

        this.name = name;
        this.bio = bio;
    }

    public void displayInfo() {
        System.out.println("Book & Author Information ");
        System.out.println("Title: " + getTitle());
        System.out.println("Publication Year: " + getPublicationYear());
        System.out.println("Author Name: " + this.name);
        System.out.println("Author Bio: " + this.bio);
    }
}

public class I11 {
    public static void main(String[] args) {
       
        Author authorBook = new Author(
                "The Ways of Code",
                2024,
                "Alex Chen",
                "A software developer passionate about teaching programming concepts."
        );

        
        authorBook.displayInfo();

        Author authorBook2 = new Author(
                "Galactic Journeys",
                2022,
                "Samira Khan",
                "Award-winning science fiction novelist."
        );
        authorBook2.displayInfo();
    }
}