package org.example.kyu6;

import java.util.*;
import java.util.stream.Collectors;

public class SortTheOdd {
    public static int[] sortArray(int[] array) {

        LinkedList<Integer> odd = Arrays.stream(array)
                .filter(o -> o % 2 != 0)
                .sorted()
                .boxed()
                .collect(Collectors.toCollection(LinkedList::new));

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                array[i] = odd.pollFirst();
            }
        }
        return array;
    }
}
