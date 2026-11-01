import java.util.Scanner;
class BankAccount {
    public String accountHolder;
    public int accountNumber;
    public double balance;
    public BankAccount(String name, int accNo, double bal) {
        accountHolder = name;
        accountNumber = accNo;
        balance = bal;
    }
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Amount Deposited: " + amount);
    }
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Amount Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient Balance!");
        }
    }
    public void display() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }
}
class SavingsAccount extends BankAccount {
    double interestRate = 4.0;
    public SavingsAccount(String name, int accNo, double bal) {
        super(name, accNo, bal);
    }
    public void addInterest() {
        double interest = balance * interestRate / 100;
        balance += interest;
        System.out.println("Interest Added: " + interest);
    }
}
class CurrentAccount extends BankAccount {
    double overdraftLimit = 1000;
    public CurrentAccount(String name, int accNo, double bal) {
        super(name, accNo, bal);
    }
   
    public void withdraw(double amount) {
        if (amount <= (balance + overdraftLimit)) {
            balance -= amount;
            System.out.println("Amount Withdrawn: " + amount);
        } else {
            System.out.println("Overdraft limit exceeded!");
        }
    }
}
public class BankingSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Account Holder Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Account Number: ");
        int accNo = sc.nextInt();
        System.out.print("Enter Initial Balance: ");
        double bal = sc.nextDouble();
        System.out.println("Choose Account Type: 1. Savings  2. Current");
        int choice = sc.nextInt();
        BankAccount account;
        if (choice == 1) {
            account = new SavingsAccount(name, accNo, bal);
        } else {
            account = new CurrentAccount(name, accNo, bal);
        }
        int option;
        do {
            System.out.println("\n1. Deposit\n2. Withdraw\n3. Display\n4. Exit");
            System.out.print("Enter your choice: ");
            option = sc.nextInt();
            switch (option) {
                case 1:
                    System.out.print("Enter amount to deposit: ");
                    double dep = sc.nextDouble();
                    account.deposit(dep);
                    break;
                case 2:
                    System.out.print("Enter amount to withdraw: ");
                    double wit = sc.nextDouble();
                    account.withdraw(wit);
                    break;
                case 3:
                    account.display();
                    break;
                case 4:
                    System.out.println("Thank you!");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        } while (option != 4);
        sc.close();
    }
}