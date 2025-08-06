import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Transaction {

    private String sender;
    private String receiver;
    private LocalDate date;
    private int amount;

    public static List<Transaction> filterFromDate(List<Transaction> transactions, LocalDate startDate) {
        return transactions.stream()
                .filter(transaction -> !transaction.getDate().isBefore(startDate) && !transaction.getDate().isAfter(LocalDate.now()))
                .collect(Collectors.toList());
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "sender='" + sender + '\'' +
                ", receiver='" + receiver + '\'' +
                ", date=" + date +
                ", amount=" + amount +
                '}';
    }
}
