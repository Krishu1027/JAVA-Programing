import java.util.Scanner;

class Account{
    private static int counter = 1000;

    private int accountNumber;
    private String accountType;
    private String name;
    private double balance;
    private String lastDepositDate;

    public Account(String name, String type, double initialBalance) {
        this.accountNumber = ++counter;
        this.name = name;
        this.accountType = type;
        this.balance = initialBalance;
        this.lastDepositDate = "01/01/2026";
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getName() {
        return name;
    }

    public String getAccountType() {
        return accountType;
    }

    public double getBalance() {
        return balance;
    }

    public String getLastDepositDate() {
        return lastDepositDate;
    }

    protected void setBalance(double balance) {
        this.balance = balance;
    }

    public void checkBalance() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Name: " + name);
        System.out.println("Type: " + accountType);
        System.out.println("Balance: Rs " + balance);
        System.out.println("Last Deposit: " + lastDepositDate);
    }

    public void deposit(double amount, String date) {
        balance = balance + amount;
        lastDepositDate = date;
        System.out.println("Deposited: Rs " + amount);
        System.out.println("New Balance: Rs " + balance);
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance = balance - amount;
            System.out.println("Withdrawn: Rs " + amount);
            System.out.println("Balance: Rs " + balance);
        } else {
            System.out.println("Insufficient balance!");
        }
    }
}

class StandardAccount extends Account {

    public StandardAccount(String name, double initialBalance) {
        super(name, "Standard", initialBalance);
    }

    @Override
    public void withdraw(double amount) {
        if (amount > 500000) {
            System.out.println("Cannot withdraw! Max limit is Rs 5 lakh");
            return;
        }

        if (amount <= 100000) {
            if (amount <= getBalance()) {
                setBalance(getBalance() - amount);
                System.out.println("Withdrawn: Rs " + amount + " (FREE)");
                System.out.println("Balance: Rs " + getBalance());
            } else {
                System.out.println("Insufficient balance!");
            }
        } else {
            double penalty = amount * 0.0005;
            double total = amount + penalty;

            if (total <= getBalance()) {
                setBalance(getBalance() - total);
                System.out.println("Withdrawn: Rs " + amount);
                System.out.println("Penalty (0.05%): Rs " + penalty);
                System.out.println("Total Deducted: Rs " + total);
                System.out.println("Balance: Rs " + getBalance());
            } else {
                System.out.println("Insufficient balance!");
            }
        }
    }

}

class PremiumAccount extends Account {

    public PremiumAccount(String name, double initialBalance) {
        super(name, "Premium", initialBalance);
    }

    @Override
    public void withdraw(double amount) {
        if (amount > 1000000) {
            System.out.println("Cannot withdraw! Max limit is Rs 10 lakh");
            return;
        }

        if (amount <= getBalance()) {
            setBalance(getBalance() - amount);
            System.out.println("Withdrawn: Rs " + amount + " (NO CHARGES)");
            System.out.println("Balance: Rs " + getBalance());
        } else {
            System.out.println("Insufficient balance!");
        }
    }
}

class SavingsAccount extends Account {

    public SavingsAccount(String name, double balance) {
        super(name, "Savings", balance);
    }

    public void calculateInterest() {
        double interest = getBalance() * 0.05;
        System.out.println("5% Interest on Rs " + getBalance() + ": Rs " + interest);
        System.out.println("Balance after interest: Rs " + (getBalance() + interest));
    }
}

public class Bankoffer {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("BANK ACCOUNT SYSTEM \n");

        System.out.print("Enter account holder name: ");
        String name1 = sc.nextLine();

        System.out.print("Enter initial balance: Rs ");
        double balance1 = sc.nextDouble();
        sc.nextLine();

        Account acc1 = new StandardAccount(name1, balance1);
        System.out.println("Standard Account created successfully!\n");

        System.out.print("Enter second account holder name: ");
        String name2 = sc.nextLine();

        System.out.print("Enter initial balance: Rs ");
        double balance2 = sc.nextDouble();
        sc.nextLine();

        Account acc2 = new PremiumAccount(name2, balance2);
        System.out.println("Premium Account created successfully!\n");

        System.out.println("\n STANDARD ACCOUNT OPERATIONS ");
        acc1.checkBalance();
        System.out.println();

        System.out.print("Enter amount to deposit: Rs ");
        double depositAmt1 = sc.nextDouble();
        sc.nextLine();
        System.out.print("Enter deposit date (DD/MM/YYYY): ");
        String date1 = sc.nextLine();
        acc1.deposit(depositAmt1, date1);
        System.out.println();

        System.out.print("Enter amount to withdraw: Rs ");
        double withdrawAmt1 = sc.nextDouble();
        sc.nextLine();
        acc1.withdraw(withdrawAmt1);
        System.out.println();

        System.out.print("Enter another amount to withdraw: Rs ");
        double withdrawAmt2 = sc.nextDouble();
        sc.nextLine();
        acc1.withdraw(withdrawAmt2);
        System.out.println();

        System.out.println("Final Standard Account Status:");
        acc1.checkBalance();

        System.out.println("\n\nPREMIUM ACCOUNT OPERATIONS ");
        acc2.checkBalance();
        System.out.println();

        System.out.print("Enter amount to deposit: Rs ");
        double depositAmt2 = sc.nextDouble();
        sc.nextLine();
        System.out.print("Enter deposit date (DD/MM/YYYY): ");
        String date2 = sc.nextLine();
        acc2.deposit(depositAmt2, date2);
        System.out.println();

        System.out.print("Enter amount to withdraw: Rs ");
        double withdrawAmt3 = sc.nextDouble();
        sc.nextLine();
        acc2.withdraw(withdrawAmt3);
        System.out.println();

        System.out.println("Final Premium Account Status:");
        acc2.checkBalance();

        System.out.println("\n\nTESTING TYPE CHECKING");

        Account acc3 = new StandardAccount("Amit", 100000);

        System.out.println("Checking if acc3 is a PremiumAccount...");
        if (acc3 instanceof PremiumAccount) {
            PremiumAccount premium = (PremiumAccount) acc3;
            premium.withdraw(5000);
        } else {
            System.out.println("acc3 is not a PremiumAccount, it's a " +
                    acc3.getAccountType() + " account");
            System.out.println("Using correct type to withdraw:");
            acc3.withdraw(5000);
        }

        System.out.println("\nTESTING SAVINGS ACCOUNT");
        SavingsAccount savings = new SavingsAccount("Neha", 50000);
        savings.checkBalance();
        System.out.println("\nCalculating interest:");
        savings.calculateInterest();  // FIX 4: Now simple calculation without recursion

        System.out.println("\n\nDYNAMIC METHOD DISPATCH DEMO");
        System.out.println("Using parent class reference for different account types");

        Account[] accounts = {acc1, acc2, acc3, savings};

        System.out.print("\nEnter withdrawal amount for testing: Rs ");
        double testAmount = sc.nextDouble();

        for (int i = 0; i < accounts.length; i++) {
            System.out.println("\nAccount " + (i+1) + ": " + accounts[i].getName() +
                    " (" + accounts[i].getAccountType() + ")");
            accounts[i].withdraw(testAmount);
        }

        sc.close();
        System.out.println("\nPROGRAM ENDED ");
    }
}
