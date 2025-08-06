import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TransactionTest {

    @Test
    public void testThatTr() {
        List<Transaction> transactions = new ArrayList<Transaction>();
        Transaction firstTransaction = new Transaction();
        firstTransaction.setSender("John Adah");
        firstTransaction.setReceiver("Matthew");
        firstTransaction.setAmount(10_000);
        firstTransaction.setDate(LocalDate.now());
    }

}