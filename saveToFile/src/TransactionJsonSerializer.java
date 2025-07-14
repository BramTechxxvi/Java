import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.List;

public class TransactionJsonSerializer {

    private final static ObjectMapper mapper = new ObjectMapper();

    public static String serialize(Transaction transaction) {
        try {
            String json = mapper.writeValueAsString(transaction);
            System.out.println("Json:: " + json);
            return json;
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        } return " ";
    }

    public static String serializeTransactions(List<Transaction> transactions) {
        try {
            return mapper.writeValueAsString(transactions);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }

    public static Transaction deserialize(String json) {
        try {
            return mapper.readValue(json, Transaction.class);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }
}
