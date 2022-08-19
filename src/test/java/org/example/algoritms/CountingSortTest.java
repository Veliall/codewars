package org.example.algoritms;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CountingSortTest {

    @Test
    public void test() {
        int[] expected = {1, 1, 1, 1, 3, 4, 54, 54, 54, 88, 99};

        int[] actual = {54, 1, 1, 3, 99, 54, 54, 88, 4, 1, 1};

        CountingSort.sort(actual);

        assertArrayEquals(expected, actual);
    }
}