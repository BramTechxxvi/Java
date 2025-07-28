package chapter15.test;

import chapter15.src.chapter15.Transactions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TransactionsTest {
    @Test
    public void testThatWriteToFilesWork(){
        String fileLocation = "C:\\Users\\Dell\\Desktop\\Mr Chibuzor\\chapter15\\ ";
        Path path = Path.of(fileLocation + "transactions.txt");
        List<Transactions> transaction = new ArrayList<>();

        Transactions value = new Transactions("suliha", "ibra", BigDecimal.valueOf(300));
        transaction.add(value);
        value.saveTransactions(fileLocation, transaction);
        assertTrue(path.toFile().exists());
    }

}