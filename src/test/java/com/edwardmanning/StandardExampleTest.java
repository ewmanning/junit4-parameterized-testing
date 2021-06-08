package com.edwardmanning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StandardExampleTest {

    @Test
    public void testAdd() {
        assertEquals(5, Math.add(3, 2));
        assertEquals(5, Math.add(2, 3));
        assertEquals(5, Math.add(1, 4));
        assertEquals(5, Math.add(0, 5));
        assertEquals(5, Math.add(-10, 15));
    }

    @Test
    public void testSubtract() {
        assertEquals(5, Math.subtract(7, 2));
        assertEquals(5, Math.subtract(8, 3));
        assertEquals(5, Math.subtract(9, 4));
        assertEquals(5, Math.subtract(10, 5));
        assertEquals(5, Math.subtract(-10, -15));
    }

}
