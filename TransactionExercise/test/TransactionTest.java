import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TransactionTest {

    @Test
    public void testThatTr() {
        List<Transaction> transactionList = Arrays.asList(
                new Transaction("John Adah", "Matthew", LocalDate.of(2024, 12, 6), 10_000),
                new Transaction("Olabode", "Hawanat", LocalDate.of(2024, 12, 23), 7_100),
                new Transaction("Olabode", "Hawanat", LocalDate.of(2024, 12, 28), 2_400),
                new Transaction("Olabode", "Hawanat", LocalDate.of(2024, 2, 3), 121_800),
                new Transaction("Olabode", "Hawanat", LocalDate.of(2025, 4, 12), 12_000),
                new Transaction("Olabode", "Hawanat", LocalDate.of(2025, 3, 18), 23_000),
                new Transaction("Olabode", "Hawanat", LocalDate.of(2025, 5, 17), 12_500),
                new Transaction("Olabode", "Hawanat", LocalDate.of(2025, 8, 6), 92_900)
        );
        LocalDate fromDate = LocalDate.of(2024, 12, 4);

        List<Transaction> filteredList = Transaction.filterFromDate(transactionList, fromDate);
    }

}