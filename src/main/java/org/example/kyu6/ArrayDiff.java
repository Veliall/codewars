package org.example.kyu6;

import java.util.Arrays;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

public class ArrayDiff {
    public static int[] arrayDiff(int[] a, int[] b) {
        List<Integer> listB = Arrays.stream(b).boxed().toList();
        SortedSet<Integer> setB = new TreeSet<>(listB);

        return Arrays.stream(a).filter(intA -> !setB.contains(intA)).toArray();
    }
}
