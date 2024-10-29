import java.util.Scanner;
class Account {
    String customer_name;
    int account_num;
    String accountType;
    double balance;

    
    public Account(String customer_name, int account_num, String accountType, double initialBalance) {
        this.customer_name = customer_name;
        this.account_num = account_num;
        this.accountType = accountType;
        this.balance = initialBalance;
    }

    
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited:" + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    
    public void displayBalance() {
        System.out.println("Account Balance:" + balance);
    }

    
    public void withdraw(double amount) {
        System.out.println("Withdrawal method not implemented for base Account class.");
    }
}

class SavAcct extends Account {
    double interestRate;

    public SavAcct(String customer_name, int account_num, double initialBalance, double interestRate) {
        super(customer_name, account_num, "Savings", initialBalance);
        this.interestRate = interestRate;
    }

       public void computeInterest() {
        double interest = balance * interestRate / 100;
        balance += interest;
        System.out.println("Interest added:" + interest);
    }

        public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew:" + amount);
        } else {
            System.out.println("Insufficient balance.");
        }
    }
}

class CurAcct extends Account {
    double minimumBalance;
    double serviceCharge;

    public CurAcct(String customer_name, int account_num, double initialBalance, double minimumBalance, double serviceCharge) {
        super(customer_name, account_num, "Current", initialBalance);
        this.minimumBalance = minimumBalance;
        this.serviceCharge = serviceCharge;
    }

       public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew:" + amount);

            if (balance < minimumBalance) {
                balance -= serviceCharge;
                System.out.println("Service charge imposed:" + serviceCharge);
            }
        } else {
            System.out.println("Insufficient balance.");
        }
    }
}

public class Bank {
    public static void main(String[] args) {
        
        SavAcct savingsAccount = new SavAcct("Harsha", 121, 6000, 5);
        savingsAccount.deposit(1000);
        savingsAccount.computeInterest();
        savingsAccount.displayBalance();
        savingsAccount.withdraw(2000);
        savingsAccount.displayBalance();

        System.out.println();

        CurAcct currentAccount = new CurAcct("Srushti", 122, 5000, 7000, 60);
        currentAccount.deposit(500);
        currentAccount.displayBalance();
        currentAccount.withdraw(2500);  
        currentAccount.displayBalance();
    }
}
