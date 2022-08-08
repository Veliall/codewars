package org.example.kyu7;

public class ExesAndOhs {
    public static boolean getXO(String str) {
        int xCount = 0;
        int oCount = 0;
        char[] chars = str.toLowerCase().toCharArray();
        for (Character ch : chars) {
            if ('x' == ch) {
                xCount++;
            }
            if ('o' == ch) {
                oCount++;
            }
        }
        return xCount == oCount;
    }
}
