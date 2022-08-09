package org.example.kyu7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IsThisTriangleTest {
    @Test
    public void publicTests() {
        assertEquals(true, IsThisTriangle.isTriangle(1,2,2));
        assertEquals(false, IsThisTriangle.isTriangle(7,2,2));
    }

}