package org.example.kyu5;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MaximumSubarraySumTest {
    @Test
    public void testEmptyArray() throws Exception {
        assertEquals( 0, MaximumSubarraySum.sequence(new int[]{}));
    }
    @Test
    public void testExampleArray() throws Exception {
        assertEquals( 6, MaximumSubarraySum.sequence(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}));
    }

    @Test
    public void testNegativeArray() throws Exception {
        assertEquals( 0, MaximumSubarraySum.sequence(new int[]{-2, -1, -3, -4, -1, -2, -1, -5, -4}));
    }
}