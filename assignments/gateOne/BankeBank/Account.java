package assignments.gateOne.BankeBank;
public class Account {

    private String firstName;
    private String lastName;
    private String pin;
    private final String accountNumber;
    private double balance;

    public Account(String firstName, String lastName, String accountNumber, String pin) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.pin = pin;
        this.accountNumber = accountNumber;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAccountName() {
        return firstName + " " + lastName;
    }

    public boolean isValidPin(String pin) {
        return pin.matches("\\d{4}") && this.pin.equals(pin);
    }

    public double getBalance(String pin) {
        if (isValidPin(pin)) return balance;
        else throw new IllegalArgumentException("Invalid pin");
    }

    public void deposit(double amount) {
        if (amount >= 0) balance += amount;
        else throw new IllegalArgumentException("Invalid amount");
    }

    public void withdraw(double amount, String pin) {
        if (!isValidPin(pin)) throw new IllegalArgumentException("Invalid pin");
        if (amount <= 0) throw new IllegalArgumentException("Invalid amount");
        if (amount > balance) throw new IllegalArgumentException("Insufficient funds");
        balance -= amount;
    }

    public void changePin(String Oldpin, String newpin) {
        if (!pin.equals(Oldpin)) throw new IllegalArgumentException("Incorrect old pin");
        if (!newpin.matches("\\d{4}")) throw new IllegalArgumentException("Invalid new pin");
        if (newpin.equals(Oldpin)) throw new IllegalArgumentException("Cannot use previous pin as new pin");
        this.pin = newpin;
    }

    public boolean verifyPin(String pin) { return this.pin.equals(pin); }

    public String getAccountNumber() { return accountNumber; }

    @Override
    public String toString() {
        return "Account {" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", accountNumber='" + accountNumber + '\'' +
                '}';
    }
}
