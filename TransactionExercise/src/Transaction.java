import java.time.LocalDate;

public class Transaction {

    private LocalDate date;
    private int amount;
    private String sender;
    private String receiver;

    public LocalDate getDate() { return date; }

    public void setDate(LocalDate date) { this.date = date; }

    public int getAmount() { return amount; }

    public void setAmount(int amount) { this.amount = amount; }

    public String getSender() { return sender; }

    public void setSender(String sender) { this.sender = sender; }

    public String getReceiver() { return receiver; }

    public void setReceiver(String receiver) { this.receiver = receiver; }



}
