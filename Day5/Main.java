import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

class ATM {
    int minBalance = 500;
    int accBalance;
    int accNumber;
    String accType;
    String name;

    public void openAccount(int acc, Scanner scanner) {
        System.out.print("Enter Name : ");
        this.name = scanner.next();
        
        System.out.print("Enter account type(Saving/Current) : ");
        this.accType = scanner.next();
        
        this.accNumber = acc;
        
        System.out.print("Enter initial Deposit amount(if No Enter 0) : ");
        int m = scanner.nextInt();
        
        this.accBalance = this.minBalance + m;
        System.out.println("Details Registered Successfully");
    }

    public void checkBalance() {
        System.out.println("Welcome " + this.name);
        System.out.println("Your Current Balance is :" + this.accBalance);
    }

    public void depositMoney(int balance) {
        if (balance > 0) {
            this.accBalance += balance;
            System.out.println("Deposit successful");
        } else {
            System.out.println("Enter an amount greater than zero");
        }
    }

    public void withdrawMoney(int balance) {
        if (this.accBalance - balance >= 500) {
            this.accBalance -= balance;
            System.out.println("Withdrawal Successful");
        } else {
            System.out.println("Insufficient Amount! Minimum amount of 500 should be maintained");
        }
    }

    public void showData() {
        System.out.println("Name is : " + this.name);
        System.out.println("Account Number is : " + this.accNumber);
        System.out.println("Account Type is : " + this.accType);
        System.out.println("Total account balance is : " + this.accBalance);
    }

    public void printData(int i) {
        System.out.printf("%-5d%-20s%-15d%-15s%-10d\n", (i + 1), name, accNumber, accType, accBalance);
    }
}

public class Main {
    public static void main(String[] args) {
        HashMap<Integer, ATM> atmMap = new HashMap<>();
        ArrayList<Integer> dataBase = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int sum;

        System.out.println("      WELCOME TO THE XYZ BANK ATM  ");

        while (true) {
            System.out.println("-----------------------------------------");
            System.out.println("||   1. Create  ATM PIN                ||");
            System.out.println("||   2. Deposit Amount                 ||");
            System.out.println("||   3. Withdrawal Amount              ||");
            System.out.println("||   4. Check Balance                  ||");
            System.out.println("||   5. Show User Data                 ||");
            System.out.println("||   6. Show Atm Data Non-Tabular      ||");
            System.out.println("||   7. Show Atm Data Tabular          ||");
            System.out.println("||   8. Show Total Atm Balance         ||");
            System.out.println("||   9. Exit                           ||");
            System.out.println("-----------------------------------------");
            System.out.print("Enter option : ");
            
            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    System.out.print("Enter the Your ATM PIN : ");
                    int acc = scanner.nextInt();
                    dataBase.add(acc);
                    
                    ATM newAtm = new ATM();
                    newAtm.openAccount(acc, scanner);
                    atmMap.put(acc, newAtm);
                    break;
                    
                case 2:
                    System.out.print("Enter Your ATM PIN : ");
                    int ac = scanner.nextInt();
                    if (atmMap.containsKey(ac)) {
                        System.out.print("Enter Deposit amount : ");
                        int m = scanner.nextInt();
                        atmMap.get(ac).depositMoney(m);
                    } else {
                        System.out.println("Account not found!");
                    }
                    break;
                    
                case 3:
                    System.out.print("Enter Your ATM PIN : ");
                    int d = scanner.nextInt();
                    if (atmMap.containsKey(d)) {
                        System.out.print("Enter Withdrawal amount : ");
                        int e = scanner.nextInt();
                        atmMap.get(d).withdrawMoney(e);
                    } else {
                        System.out.println("Account not found!");
                    }
                    break;
                    
                case 4:
                    System.out.print("Enter Your ATM PIN : ");
                    int x = scanner.nextInt();
                    if (atmMap.containsKey(x)) {
                        atmMap.get(x).checkBalance();
                    } else {
                        System.out.println("Account not found!");
                    }
                    break;
                    
                case 5:
                    System.out.print("Enter Your ATM PIN : ");
                    int g = scanner.nextInt();
                    if (atmMap.containsKey(g)) {
                        atmMap.get(g).showData();
                    } else {
                        System.out.println("Account not found!");
                    }
                    break;
                    
                case 6:
                    for (int i = 0; i < dataBase.size(); i++) {
                        atmMap.get(dataBase.get(i)).showData();
                    }
                    break;
                    
                case 7:
                    System.out.printf("%-5s%-20s%-15s%-15s%-10s\n", "S.No", "A/c Holder Name", "A/c No.", "A/c Type.", "Balance");
                    for (int i = 0; i < dataBase.size(); i++) {
                        System.out.println("--------------------------------------------------------------");
                        atmMap.get(dataBase.get(i)).printData(i);
                    }
                    System.out.println("--------------------------------------------------------------");
                    break;
                    
                case 8:
                    sum = 0;
                    for (int i = 0; i < dataBase.size(); i++) {
                        int temp = dataBase.get(i);
                        sum += atmMap.get(temp).accBalance;
                    }
                    System.out.println("Total Balance in ATM is " + sum);
                    break;
                    
                case 9:
                    System.out.println("Thank you for using our Service");
                    scanner.close();
                    return;
                    
                default:
                    System.out.println("Invalid Option! Try again");
                    break;
            }
        }
    }
}