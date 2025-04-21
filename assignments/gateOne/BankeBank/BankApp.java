package assignments.gateOne.BankeBank;
import java.util.ArrayList;

public class BankApp {

    private ArrayList<Account> myAccount = new ArrayList<>();

    public String registerUser(String firstName, String lastName, String pin) {
        String accountNumber = generateAccountNumber();
        Account newAccount = new Account(firstName, lastName, accountNumber, pin);
        newAccount.setFirstName(firstName);
        newAccount.setLastName(lastName);
        myAccount.add(newAccount);
        return accountNumber;
    }

    public String generateAccountNumber() {
        long number = (long)(Math.random() * 9_000_000_000L) + 1_000_000_000L;
        return String.valueOf(number);
    }

    public Account getAccount(String accountNumber, String pin) {
        for (Account account : myAccount) {
            if (account.getAccountNumber().equals(accountNumber) && account.verifyPin(pin)) {
                return account;
            }
        } throw new IllegalArgumentException("Invalid account number or Pin");
    }

    public void depositMoney(String accountNumber, double amount) {
        boolean accountFound = false;
        for (Account account : myAccount) {
            if(account.getAccountNumber().equals(accountNumber)) {
                account.deposit(amount);
                System.out.println("Deposited " + amount + " to " + account.getAccountNumber());
                accountFound = true;
                break;
            }
        } if(!accountFound) throw new IllegalArgumentException("Account not found");
    }

    public void withdrawMoney(String accountNumber, double amount, String pin) {
        boolean accountFound = false;
        for (Account account : myAccount) {
            if(account.getAccountNumber().equals(accountNumber)) {
                account.withdraw(amount, pin);
                System.out.println("Withdraw successful \nYour new balance is: " + account.getBalance(pin));
                accountFound = true;
                break;
            }
        } if(!accountFound) throw new IllegalArgumentException("Account not found");
    }

    public double checkBalance(String accountNumber, String pin) {
        for (Account account : myAccount) {
            if(account.getAccountNumber().equals(accountNumber)) {
            if (account.verifyPin(pin)) return account.getBalance(pin);
            else throw new IllegalArgumentException("Invalid pin");
            }
        } throw new IllegalArgumentException("Invalid account number");
    }


}