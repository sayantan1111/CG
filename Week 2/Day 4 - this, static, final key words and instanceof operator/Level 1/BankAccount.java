public class BankAccount {

    public static String bankName = "MyBank";
    private static int totalAccounts = 0;
    private final String accountNumber;
    private String accountHolderName;
    private double balance;

    public BankAccount(String accountHolderName, String accountNumber, double balance) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.balance = balance;
        totalAccounts++;public class Book {

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
    }

    public static void getTotalAccounts() {
        System.out.println("Total number of accounts: " + totalAccounts);
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance.");
        }
    }

    public void displayAccountDetails() {
        System.out.println("Bank Name: " + bankName);
        System.out.println("Account Holder Name: " + this.accountHolderName);
        System.out.println("Account Number: " + this.accountNumber);
        System.out.println("Balance: " + this.balance);
    }

    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("Alice", "123456", 1000.0);
        BankAccount account2 = new BankAccount("Bob", "789012", 500.0);

        System.out.println("Bank Name (from account1): " + account1.bankName);
        System.out.println("Bank Name (from account2): " + account2.bankName);
        BankAccount.getTotalAccounts();

        System.out.println("\nAccount 1 Details:");
        if (account1 instanceof BankAccount) {
            account1.displayAccountDetails();
        }

        System.out.println("\nAccount 2 Details:");
        if (account2 instanceof BankAccount) {
            account2.displayAccountDetails();
        }

        account1.deposit(200.0);
        account2.withdraw(100.0);

        System.out.println("\nUpdated Account 1 Details:");
        if (account1 instanceof BankAccount) {
            account1.displayAccountDetails();
        }

        System.out.println("\nUpdated Account 2 Details:");
        if (account2 instanceof BankAccount) {
            account2.displayAccountDetails();
        }

        BankAccount.bankName = "NewBank";
        System.out.println("\nBank Name after change (from account1): " + account1.bankName);
        System.out.println("Bank Name after change (from account2): " + account2.bankName);
    }
}