import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {

        PasswordEncoder isReverseMatch = (password, reversed) -> {
            return password.equals(reversePass(reversed));
        };

        PasswordEncoder hasSameLength = (password, reversed) -> {
            return password.length() == reversed.length();
        };

        PasswordEncoder isExactMatch = (first, second) -> {
            return first.equals(second);
        };

        String actualPassword = "lola";
        String reversed = "lola";

        System.out.println(isReverseMatch.isReversePassword(actualPassword, reversed));
        System.out.println(hasSameLength.isReversePassword(actualPassword, reversed));
        System.out.println(isExactMatch.isReversePassword(actualPassword, reversed));

    }

    private static String reversePass(String password) {
        String result = "";
        for (int counter = password.length() - 1; counter >= 0; counter--) {
            result += password.charAt(counter);
        }
        return result;
    }


}