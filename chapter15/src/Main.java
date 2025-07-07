import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {
    public static void main(String[] args) throws SQLException {
        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost")){
            Statement statement = connection.createStatement();
            statement.executeQuery("SELECT id, firstName, lastName");
        } catch(SQLException e){
            throw new RuntimeException(e);
        }
    }

}