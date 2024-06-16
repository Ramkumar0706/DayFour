package problemStatement;

public class BankingSystem {
    public static void main(String[] args) {
        // Create customers
        Customer customer1 = new Customer(1, "Alice");
        Customer customer2 = new Customer(2, "Bob");

        // Create accounts
        Account account1 = new Account(101, "Savings", 1000);
        Account account2 = new Account(102, "Checking", 500);

        // Add accounts to customers
        customer1.addAccount(account1);
        customer1.addAccount(account2);

        // Perform operations
        account1.deposit(200);
        account1.withdraw(150);

        // Display customer details
        System.out.println(customer1);

        // Remove an account
        customer1.removeAccount(102);

        // Display customer details again
        System.out.println(customer1);
    }
}