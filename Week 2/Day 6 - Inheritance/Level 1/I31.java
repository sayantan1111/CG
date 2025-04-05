class BankAccount {
    String accountNumber;
    double balance;

    BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    void displayDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }
}

class SavingsAccount extends BankAccount {
    double interestRate;

    SavingsAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    void displayAccountType() {
        System.out.println("Account Type: Savings Account");
    }

    void displayDetails() {
        super.displayDetails();
        System.out.println("Interest Rate: " + interestRate + "%");
    }
}

class CheckingAccount extends BankAccount {
    double withdrawalLimit;

    CheckingAccount(String accountNumber, double balance, double withdrawalLimit) {
        super(accountNumber, balance);
        this.withdrawalLimit = withdrawalLimit;
    }

    void displayAccountType() {
        System.out.println("Account Type: Checking Account");
    }

    void displayDetails() {
        super.displayDetails();
        System.out.println("Withdrawal Limit: " + withdrawalLimit);
    }
}

class FixedDepositAccount extends BankAccount {
    int durationInMonths;

    FixedDepositAccount(String accountNumber, double balance, int durationInMonths) {
        super(accountNumber, balance);
        this.durationInMonths = durationInMonths;
    }

    void displayAccountType() {
        System.out.println("Account Type: Fixed Deposit Account");
    }

    void displayDetails() {
        super.displayDetails();
        System.out.println("Duration (months): " + durationInMonths);
    }
}

public class I31 {
    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount("SA123", 5000.0, 4.5);
        CheckingAccount ca = new CheckingAccount("CA456", 3000.0, 1000.0);
        FixedDepositAccount fda = new FixedDepositAccount("FDA789", 10000.0, 12);

        sa.displayAccountType();
        sa.displayDetails();

        System.out.println();

        ca.displayAccountType();
        ca.displayDetails();

        System.out.println();

        fda.displayAccountType();
        fda.displayDetails();
    }
}
