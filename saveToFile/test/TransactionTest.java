import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.List;

import static java.time.LocalDate.now;
import static org.junit.jupiter.api.Assertions.*;

class TransactionTest {


    @Test
    public void testShouldSerializeTransaction() {
        Transaction transaction = new Transaction();
        transaction.setSender("Hawanat");
        transaction.setRecipient("Bode");
        transaction.setDate(now());
        transaction.setAmount(new BigDecimal("100000.00"));
        String json = TransactionJsonSerializer.serialize(transaction);
        String expected = "{\"sender\":\"Hawanat\",\"recipient\":\"Bode\",\"date\":\"2025-07-14\"\"amount\":100000.00}";
        assertNotNull(json);
        assertEquals(expected, json);

    }

    @Test
    public void testSaveToFile() throws IOException {
        String fileLocation = "C:\\Users\\Dell\\Desktop\\Mr Chibuzor\\saveToFile\\src\\transactions.txt";
        Transaction transaction = new Transaction();
        transaction.setAmount(new BigDecimal("300"));
        transaction.setDate(now());
        transaction.setSender("Suliha");
        transaction.setRecipient("Bram");
        List<Transaction> transactions = List.of(transaction);
        transaction.saveTransactions(fileLocation,transactions);
        String dataInFile = Transaction.readFromFile(fileLocation);
        assertNotNull(dataInFile);
        assertFalse(dataInFile.isEmpty());
    }

//    @Test
//    public void testReadFromFile() throws IOException {
//        String fileLocation = "C:\\Users\\Dell\\Desktop\\Mr Chibuzor\\saveToFile\\src\\transactions.txt";
//        String data = Transaction.readFromFile(fileLocation);
//        assertFalse(data.isEmpty());
//    }

}