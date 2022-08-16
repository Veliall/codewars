package org.example.kyu6;

import java.util.HashMap;

public class DuplicateEncoder {
    static String encode(String word) {
        HashMap<Character, Character> codeMap = new HashMap<>();
        char[] chars = word.toLowerCase().toCharArray();
        for (Character ch : chars) {
            if (!codeMap.containsKey(ch)) {
                codeMap.put(ch, '(');
            } else {
                codeMap.replace(ch, ')');
            }
        }

        StringBuilder sb = new StringBuilder();
        for (Character ch : chars) {
            sb.append(codeMap.get(ch));
        }

        return sb.toString();
    }
}
