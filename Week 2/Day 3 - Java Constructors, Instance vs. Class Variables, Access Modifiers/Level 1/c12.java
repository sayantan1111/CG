public class BankAccount {
    public String accountNumber;
    protected String accountHolder;
    private double balance;

    public BankAccount(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void displayAccountDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: " + balance);
    }
}

class SavingsAccount extends BankAccount {
    double interestRate;

    public SavingsAccount(String accountNumber, String accountHolder, double balance, double interestRate) {
        super(accountNumber, accountHolder, balance);
        this.interestRate = interestRate;
    }

    public void displaySavingsAccountDetails() {
        System.out.println("Savings Account Details:");
        System.out.println("Account Number: " + accountNumber); 
        System.out.println("Account Holder: " + accountHolder); 
        System.out.println("Balance: " + getBalance()); 
        System.out.println("Interest Rate: " + interestRate + "%");
    }

    public void applyInterest() {
        double interest = getBalance() * (interestRate / 100);
        setBalance(getBalance() + interest);
        System.out.println("Interest applied. New balance: " + getBalance());
    }

    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("12345", "Alice", 10000.0);
        account1.displayAccountDetails();

        account1.setBalance(15000.0);
        System.out.println("Updated balance: " + account1.getBalance());

        System.out.println();

        SavingsAccount savingsAccount1 = new SavingsAccount("67890", "Bob", 20000.0, 5.0);
        savingsAccount1.displaySavingsAccountDetails();

        System.out.println();

        savingsAccount1.applyInterest();

        System.out.println();
        savingsAccount1.displaySavingsAccountDetails();
    }
}