package org.example.kyu6;

public class ConvertStringToCamelCase {

    public static void main(String[] args) {
        String s1 = toCamelCase("the_Stealth_Warrior");
        String s2 = toCamelCase("The-Stealth-Warrior");
        System.out.println(s1);
        System.out.println(s2);
    }

    static String toCamelCase(String s) {
        if (s == null || s.isEmpty() || s.isBlank()) return s;
        String[] split = splitString(s);
        StringBuilder sb = new StringBuilder();
        sb.append(split[0]);
        for (int i = 0; i < split.length; i++) {
            if (i == 0) continue;
            String capitalized = split[i].substring(0, 1).toUpperCase() +
                            split[i].substring(1).toLowerCase();
            sb.append(capitalized);
        }
        return sb.toString();
    }

    private static String[] splitString(String s) {
        if (s.split("-").length > 1) {
            return s.split("-");
        } else {
            return s.split("_");
        }
    }
}
