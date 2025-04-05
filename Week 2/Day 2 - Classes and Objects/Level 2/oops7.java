class BankAccount {
    String accountHolder;
    String accountNumber;
    double balance;

    BankAccount(String accountHolder, String accountNumber, double balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println(amount + " deposited successfully.");
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    void withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
            System.out.println(amount + " withdrawn successfully.");
        } else if (amount <= 0){
            System.out.println("Invalid withdraw amount.");
        }
        else {
            System.out.println("Insufficient balance.");
        }
    }

    void displayBalance() {
        System.out.println("Current balance: " + balance);
    }

    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("Alice Smith", "123456789", 5000.0);

        account1.displayBalance();
        account1.deposit(500.0);
        account1.displayBalance();
        account1.withdraw(200.0);
        account1.displayBalance();
        account1.withdraw(2000.0);
        account1.displayBalance();

    }
}