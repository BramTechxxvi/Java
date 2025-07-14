import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.math.BigDecimal;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Transaction {
    private BigDecimal amount;
    private LocalDateTime date;
    private String recipient;
    private String sender;

    String folderPath = "C:\\Users\\Dell\\Desktop\\Mr Chibuzor\\saveToFile\\src";

    public Transaction(BigDecimal amount, String recipient, String sender) {
        this.amount = amount;
        this.recipient = recipient;
        this.sender = sender;
        date = LocalDateTime.now();
    }

    public void saveTransactions(String fileLocation, List<Transaction> transactions) throws IOException {
        fileLocation = folderPath + "transactions.txt";
        if (transactions == null || transactions.isEmpty()) transactions = new ArrayList<>();
        Path path = Path.of(fileLocation);
        if (Files.exists(path)) Files.createFile(path);

        try (BufferedWriter writer = Files.newBufferedWriter(path)) {
            for (Transaction transaction : transactions) {
                writer.write(transaction.toString()+" ");
            }
        }
    }

    public String readFromFile(String fileLocation) throws IOException {
        fileLocation = folderPath + "transactions.txt";
        Path path = Path.of(fileLocation);
        String data = "";
        try (BufferedReader reader = Files.newBufferedReader(path)) {
            data+=reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return data;
    }

}
