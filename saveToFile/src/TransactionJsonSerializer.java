import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.List;

public class TransactionJsonSerializer {

    public static String serialize(Transaction transaction) {
        try {
            String json = mapper.writeValueAsString(transaction);
            System.out.println("Json:: " + json);
            return json;
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        } return " ";
    }

    public static String serializeTransactions(List<Transaction> transactionList) {
        try {
            return
        }
    }
}
