import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class TransactionJsonSerializer {

    public static String serialize(Transaction transaction) {
        try {
            ObjectMapper mapper = new ObjectMapper();
            String json = mapper.writeValueAsString(transaction);
            System.out.println("Json:: " + json);
            return json;
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
    }
}
