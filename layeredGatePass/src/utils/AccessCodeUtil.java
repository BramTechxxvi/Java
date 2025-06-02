package utils;

import data.models.AccessCode;
import java.security.SecureRandom;
import java.util.ArrayList;

public class AccessCodeUtil {

    public static AccessCode generateToken() {
        String alphabets = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        String digits = "0123456789";
        String symbols = "@$%#><?";
        String token = "";
        token+=alphabets+digits+symbols;
        SecureRandom random = new SecureRandom();
        AccessCode accessCode = new AccessCode();
        char access = ' ';
        for (int count = 0; count < 6; count++) {
           access += token.charAt(random.nextInt(token.length()));
           accessCode.setCode(String.valueOf(access));
        } return accessCode;
        }
}
