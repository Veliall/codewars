package org.example.kyu7;

public class IsThisTriangle {
    public static boolean isTriangle(int a, int b, int c) {
        if (a <= 0 || b <= 0 || c <= 0) {
            return false;
        }

        return (a > b - c && a < b + c) &&
                (b > a - c && b < a + c) &&
                (c > a - b && c < a + b);
    }
}
