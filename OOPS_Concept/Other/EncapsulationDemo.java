package OOPS_Concept.Other;

public class EncapsulationDemo {

    // -------- ENCAPSULATED CLASS --------
    static class BankAccount {

        // 1. Data hiding using private variables
        private String accountHolderName;
        private double balance;

        // 2. Public setter method (controlled write access)
        public void setAccountHolderName(String name) {
            this.accountHolderName = name;
        }

        // 3. Public getter method (controlled read access)
        public String getAccountHolderName() {
            return accountHolderName;
        }

        // 4. Deposit method (business rule applied)
        public void deposit(double amount) {
            if (amount > 0) {
                balance += amount;
                System.out.println("Amount deposited: " + amount);
            } else {
                System.out.println("Invalid deposit amount");
            }
        }

        // 5. Withdraw method (business rule applied)
        public void withdraw(double amount) {
            if (amount > 0 && amount <= balance) {
                balance -= amount;
                System.out.println("Amount withdrawn: " + amount);
            } else {
                System.out.println("Insufficient balance or invalid amount");
            }
        }

        // 6. Getter for balance (read-only access)
        public double getBalance() {
            return balance;
        }
    }

    // -------- MAIN METHOD --------
    public static void main(String[] args) {

        BankAccount account = new BankAccount();

        account.setAccountHolderName("Ravi");

        account.deposit(5000);
        account.withdraw(2000);

        System.out.println("Account Holder: " + account.getAccountHolderName());
        System.out.println("Current Balance: " + account.getBalance());
    }
}
