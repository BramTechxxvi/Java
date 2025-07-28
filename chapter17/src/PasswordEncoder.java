public interface PasswordEncoder {

    boolean isReversePassword(String password, String reversedPassword);
}
