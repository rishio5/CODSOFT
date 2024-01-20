import java.util.Scanner;

public class BankAccount {
    private double balance;

    public BankAccount(double initialbalance) {
        if (initialbalance > 0) {
            this.balance = initialbalance;
        } else {
            this.balance = 0;
        }
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
            System.out.println("the deposited amount is: " + "Rs" + amount);
        } else {
            System.out.println("Invalid amount cant be deposited");
        }
    }

    public void withdraw(double amount) {
        if (amount >= 0 && amount <= balance) {
            this.balance -= amount;
            System.out.println("the deposited amount is: " + "Rs" + amount);

        } else {
            System.out.println("Insufficient balance required amount cant be withdrawn");

        }
    }
}

class AtmInterface {
    private BankAccount bankaccount;

    public AtmInterface(BankAccount bankaccount) {
        this.bankaccount = bankaccount;
    }

    public void deposit() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the amount to be deposited: Rs");
        double amount = scanner.nextDouble();
        bankaccount.deposit(amount);
    }

    public void withdraw() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Amount to be withdrawn: Rs");
        double amount = scanner.nextDouble();
        bankaccount.withdraw(amount);
    }

    public void checkBalance() {
        double currentBalance = bankaccount.getBalance();
        System.out.println("the current balance is: Rs" + currentBalance);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the initial Balance: Rs");
        double initialBalance = scanner.nextDouble();
        BankAccount bankaccount = new BankAccount(initialBalance);
        AtmInterface atminterface = new AtmInterface(bankaccount);
        atminterface.deposit();
        atminterface.withdraw();
        atminterface.checkBalance();
    }
}
