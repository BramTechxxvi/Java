import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.math.BigDecimal;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TransactionTest {

    @Test
    public void testSaveToFile() throws IOException {
        String fileLocation = "C:\\Users\\Dell\\Desktop\\Mr Chibuzor\\saveToFile\\src\\transactions.txt";
        Transaction transaction = new Transaction(BigDecimal.valueOf(300),"suliyat", "ibra");
        List<Transaction> transactions = List.of(transaction);
        transaction.saveTransactions(fileLocation,transactions);
        String dataInFile = Files.readString(Path.of(fileLocation));
        assertNotNull(dataInFile);
        assertFalse(dataInFile.isEmpty());

    }

    @Test
    public void testReadFromFile() throws IOException {
        String fileLocation = "C:\\Users\\Dell\\Desktop\\Mr Chibuzor\\saveToFile\\src\\transactions.txt";
        String data = Transaction.readFromFile(fileLocation);
        assertFalse(data.isEmpty());
    }

}