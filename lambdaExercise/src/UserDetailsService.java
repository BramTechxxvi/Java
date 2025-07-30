public interface UserDetailsService {

    User getUserDetails(String username, String password);
}
