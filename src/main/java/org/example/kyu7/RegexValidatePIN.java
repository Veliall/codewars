package org.example.kyu7;

import java.util.regex.Pattern;

public class RegexValidatePIN {
    public static boolean validatePin(String pin) {
        return Pattern.matches("\\d{4}|\\d{6}",pin);
    }
}
