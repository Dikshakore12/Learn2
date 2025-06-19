import java.util.*; 
 
class Account { 
    protected String accountNumber; 
    protected String accountHolder; 
    protected double balance; 
    protected String accountType; 
     
    public Account(String accountNumber, String accountHolder, double 
balance, String accountType) { 
        this.accountNumber = accountNumber; 
        this.accountHolder = accountHolder; 
        this.balance = balance; 
        this.accountType = accountType; 
    } 
     
    public void deposit(double amount) { 
        balance += amount; 
        System.out.println("Amount deposited successfully. New balance: " + 
balance); 
    } 
     
    public boolean withdraw(double amount) { 
        if (amount <= balance) { 
            balance -= amount; 
            System.out.println("Amount withdrawn successfully. New balance: 
" + balance); 
            return true; 
        } else { 
            System.out.println("Insufficient balance."); 
            return false; 
        } 
    } 
     
    public void displayPassbook() { 
        System.out.println("\nPassbook Details:"); 
        System.out.println("Account Holder: " + accountHolder); 
        System.out.println("Account Number: " + accountNumber); 
        System.out.println("Account Type: " + accountType); 
        System.out.println("Balance: " + balance); 
    } 
} 
 
class ATM { 
    public static void atmOperations(Account account, Scanner scanner) { 
        while (true) { 
            System.out.println("\nATM Menu:"); 
            System.out.println("1. Withdraw"); 
            System.out.println("2. Deposit"); 
            System.out.println("3. Check Balance"); 
            System.out.println("4. Exit"); 
            System.out.print("Enter your choice: "); 
            int choice = scanner.nextInt(); 
            switch (choice) { 
                case 1: 
                    System.out.print("Enter withdrawal amount: "); 
                    double withdrawAmount = scanner.nextDouble(); 
                    account.withdraw(withdrawAmount); 
                    break; 
                case 2: 
                    System.out.print("Enter deposit amount: "); 
                    double depositAmount = scanner.nextDouble(); 
                    account.deposit(depositAmount); 
                    break; 
                case 3: 
                    account.displayPassbook(); 
                    break; 
                case 4: 
                    System.out.println("Exiting ATM..."); 
                    return; 
                default: 
                    System.out.println("Invalid choice. Try again."); 
            } 
        } 
    } 
} 
public class BankingSystem { 
    public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in); 
        System.out.println("Welcome to the Banking System"); 
         
        System.out.print("Enter Account Holder Name: "); 
        String name = scanner.nextLine(); 
        System.out.print("Enter Account Number: "); 
        String accNum = scanner.nextLine(); 
        System.out.print("Enter Initial Balance: "); 
        double balance = scanner.nextDouble(); 
        scanner.nextLine(); // Consume newline 
        System.out.print("Enter Account Type (Savings/Current): "); 
        String accType = scanner.nextLine(); 
         
        Account account = new Account(accNum, name, balance, accType); 
        account.displayPassbook(); 
         
        ATM.atmOperations(account, scanner); 
        scanner.close() 
   } 
} 
