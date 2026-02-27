class Bank {
    
    private double balance;

    
    Bank(double initialBalance) {
        balance = initialBalance;
    }

    
    public void credit(double amount) {
        if (amount > 0) {
            balance = balance + amount;
            System.out.println("Amount Credited: " + amount);
        } else {
            System.out.println("Invalid credit amount");
        }
    }

    
    public void debit(double amount) {
        if (amount > 0 && amount <= balance) {
            balance = balance - amount;
            System.out.println("Amount Debited: " + amount);
        } else {
            System.out.println("Insufficient balance or invalid amount");
        }
    }

    
    public void checkBalance() {
        System.out.println("Current Balance: " + balance);
    }
}


public class BankAccount {
    public static void main(String[] args) {
        Bank acc = new Bank(23000);

        acc.checkBalance();
        acc.credit(1000);
        acc.checkBalance();
        acc.debit(200);
        acc.checkBalance();
    }
}