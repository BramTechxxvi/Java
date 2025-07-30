import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<User> userList = new ArrayList<>();

        User firstUser = new User("John", "Doe", true);
        User secondUser = new User("Jane", "Doe", true);
        userList.add(firstUser);
        userList.add(secondUser);

        UserDetailsService details = (username, password)-> {
//            boolean isValidUsername = userList.stream().anyMatch(user -> user
//                    .getUsername().equals(username));
//            boolean isValidPassword = userList.stream().anyMatch( user -> user
//                    .getPassword().equals(password));
            return userList.stream()
                    .filter(user -> user.getUsername().equals(username) && firstUser.getPassword().equals(password))
                    .findFirst()
                    .map(user -> new User(user.getUsername(), user.getPassword(), true))
                    .orElse(new User(" ", " ", false));
        };

        System.out.println(details.getUserDetails("Grace", "password"));
        System.out.println(details.getUserDetails("John", "Doe"));
    }
}