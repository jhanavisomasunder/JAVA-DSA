import java.util.*;

class Account {
    protected String accNumber;
    protected String accHolder;
    protected double balance;

    public Account(String accNumber, String accHolder, double balance) {
        this.accNumber = accNumber;
        this.accHolder = accHolder;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance!");
        }
    }

    public void checkBalance() {
        System.out.println("Balance: " + balance);
    }

    public void accountDetails() {
        System.out.println("Account Number: " + accNumber);
        System.out.println("Account Holder: " + accHolder);
        System.out.println("Balance: " + balance);
    }
}

class BankingSystem extends Account {
    public BankingSystem(String accNumber, String accHolder, double balance) {
        super(accNumber, accHolder, balance);
    }

    public void transferMoney(Account receiver, double amount) {
        if (amount <= balance) {
            balance -= amount;
            receiver.balance += amount;
            System.out.println("Transferred " + amount + " to " + receiver.accHolder);
        } else {
            System.out.println("Insufficient balance for transfer!");
        }
    }
}

public class BankManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, BankingSystem> accounts = new HashMap<>();

        int choice;
        do {
            System.out.println("\n--- Banking Menu ---");
            System.out.println("1. Create Account");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Check Balance");
            System.out.println("5. Transfer Money");
            System.out.println("6. Account Details");
            System.out.println("7. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1: // Create Account
                    System.out.print("Enter Account Number: ");
                    String accNo = sc.next();
                    System.out.print("Enter Account Holder: ");
                    String accHolder = sc.next();
                    System.out.print("Enter Initial Balance: ");
                    double bal = sc.nextDouble();
                    accounts.put(accNo, new BankingSystem(accNo, accHolder, bal));
                    System.out.println("Account created successfully!");
                    break;

                case 2: // Deposit
                    System.out.print("Enter Account Number: ");
                    accNo = sc.next();
                    if (accounts.containsKey(accNo)) {
                        System.out.print("Enter amount: ");
                        accounts.get(accNo).deposit(sc.nextDouble());
                    } else {
                        System.out.println("Account not found!");
                    }
                    break;

                case 3: // Withdraw
                    System.out.print("Enter Account Number: ");
                    accNo = sc.next();
                    if (accounts.containsKey(accNo)) {
                        System.out.print("Enter amount: ");
                        accounts.get(accNo).withdraw(sc.nextDouble());
                    } else {
                        System.out.println("Account not found!");
                    }
                    break;

                case 4: // Check Balance
                    System.out.print("Enter Account Number: ");
                    accNo = sc.next();
                    if (accounts.containsKey(accNo)) {
                        accounts.get(accNo).checkBalance();
                    } else {
                        System.out.println("Account not found!");
                    }
                    break;

                case 5: // Transfer
                    System.out.print("Enter Sender Account Number: ");
                    String sender = sc.next();
                    System.out.print("Enter Receiver Account Number: ");
                    String receiver = sc.next();
                    if (accounts.containsKey(sender) && accounts.containsKey(receiver)) {
                        System.out.print("Enter amount: ");
                        double amt = sc.nextDouble();
                        accounts.get(sender).transferMoney(accounts.get(receiver), amt);
                    } else {
                        System.out.println("Invalid account(s)!");
                    }
                    break;

                case 6: // Account Details
                    System.out.print("Enter Account Number: ");
                    accNo = sc.next();
                    if (accounts.containsKey(accNo)) {
                        accounts.get(accNo).accountDetails();
                    } else {
                        System.out.println("Account not found!");
                    }
                    break;

                case 7:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice != 7);

        sc.close();
    }
}