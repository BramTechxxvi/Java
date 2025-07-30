public class User {

    private String username;
    private String password;
    private boolean isValid

    public User(String username, String password, boolean isValid) {
        this.username = username;
        this.password = password;
        this.isValid = isValid;
    }

    public String getUsername() { return username; }

    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() { return password; }

    public void setPassword(String password) {
        this.password = password;
    }
}
