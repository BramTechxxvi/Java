import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;


@Getter
@AllArgsConstructor
@EqualsAndHashCode
public class Transaction {

    private String sender;
    private String receiver;
    private LocalDate date;
    private int amount;

    public static List<Transaction> filterFromDate(List<Transaction> transactions, LocalDate startDate) {
        LocalDate today = LocalDate.now();
        return transactions.stream()
                .filter(transaction -> {
                    LocalDate date = transaction.getDate();
                    return (date.isEqual(startDate) || date.isAfter(startDate)) &&
                            (date.isEqual(today) || date.isBefore(today));
                })
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
