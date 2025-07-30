package taskTwo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.math.BigDecimal;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Transaction {

    private String sender;
    private String recipient;
    private BigDecimal amount;
    private LocalDate date;


    public String getSender() { return sender; }

    public void setSender(String sender) { this.sender = sender; }

    public String getRecipient() { return recipient; }

    public void setRecipient(String recipient) { this.recipient = recipient; }

        public void saveTransactions(String fileLocation, List<Transaction> transactions) throws IOException {
            if (transactions == null || transactions.isEmpty()) transactions = new ArrayList<>();
            Path path = Path.of(fileLocation);
            if (!Files.exists(path)) Files.createFile(path);

            try (BufferedWriter writer = Files.newBufferedWriter(path)) {
                for (Transaction transaction : transactions) {
                    String transactionDetails = String.format("Sender: %s, Receiver: %s, Amount: %s, Date: %s, ", transaction.sender, transaction.recipient, transaction.amount.toString(), transaction.date.toString());
                    writer.write(transactionDetails);
                }
            }
        }

        public static String readFromFile(String fileLocation) {
            Path path = Path.of(fileLocation);
            StringBuilder text = new StringBuilder();
            try (BufferedReader reader = Files.newBufferedReader(path)) {
                while(reader.ready()) text.append(reader.readLine());
            } catch (IOException e) {
                e.printStackTrace();
            }
            System.out.println(text);
            return text.toString();
        }
    }

}
