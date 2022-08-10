package org.example.kyu6;

import java.util.HashSet;
import java.util.Set;

public class MultiplesOf3Or5 {
    public int solution(int number) {
        int sum = 0;
        for (int i = 1; i < number; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                sum += i;
            }
        }
        return sum;
    }
}
