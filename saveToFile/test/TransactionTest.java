import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
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
        String expected = "{\"sender\":\"Hawanat\",\"recipient\":\"Bode\",\"date\":\"2025-7-14\",\"amount\":100000.00}";
        assertNotNull(json);
        assertEquals(expected, json);
    }

    @Test
    public void testShouldSerializeTransactions() {
        Transaction hawaliesTransaction = new Transaction();
        hawaliesTransaction.setSender("Hawanat");
        hawaliesTransaction.setRecipient("Bode");
        hawaliesTransaction.setDate(now());
        hawaliesTransaction.setAmount(new BigDecimal("100000.00"));

        Transaction bramTransaction = new Transaction();
        bramTransaction.setSender("Bram");
        bramTransaction.setRecipient("Ibrahim");
        bramTransaction.setDate(now());
        bramTransaction.setAmount(new BigDecimal("1000.00"));

        List<Transaction> transactions = List.of(hawaliesTransaction, bramTransaction);
        String json = TransactionJsonSerializer.serializeTransactions(transactions);
        String expected = "[{\"sender\":\"Hawanat\",\"recipient\":\"Bode\",\"date\":\"2025-7-14\",\"amount\":100000.00},{\"sender\":\"Bram\",\"recipient\":\"Ibrahim\",\"date\":\"2025-7-14\",\"amount\":1000.00}]";
        assertNotNull(json);
        assertEquals(expected, json);
    }

    @Test
    public void testShouldDeserializeTransaction() {}

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