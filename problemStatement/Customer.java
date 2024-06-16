package problemStatement;

import java.util.HashMap;
import java.util.Map;

public class Customer {
    private int customerId;
    private String name;
    private Map<Integer, Account> accounts;

    public Customer(int customerId, String name) {
        this.customerId = customerId;
        this.name = name;
        this.accounts = new HashMap<>();
    }

    public void addAccount(Account account) {
        accounts.put(account.getAccountNumber(), account);
        System.out.println("Account " + account.getAccountNumber() + " added for customer " + name + ".");
    }

    public void removeAccount(int accountNumber) {
        if (accounts.containsKey(accountNumber)) {
            accounts.remove(accountNumber);
            System.out.println("Account " + accountNumber + " removed.");
        } else {
            System.out.println("Account not found.");
        }
    }

    public Account getAccount(int accountNumber) {
        return accounts.get(accountNumber);
    }

    public Iterable<Account> getAllAccounts() {
        return accounts.values();
    }

    @Override
    public String toString() {
        StringBuilder accountDetails = new StringBuilder();
        for (Account account : accounts.values()) {
            accountDetails.append(account.toString()).append("\n");
        }
        return "Customer(" + customerId + ", " + name + ")\nAccounts:\n" + accountDetails.toString();
    }
}
