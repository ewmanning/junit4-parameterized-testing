package com.edwardmanning;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class ParameterizedExampleTest {
    private final int first;
    private final int second;
    private final int result;

    @Parameterized.Parameters()
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {
                //Add
            {3, 2, 5},
            {2, 3, 5},
            {1, 4, 5},
            {0, 5, 5},
            {-10, 15, 5},
                //Subtract
            {7, 2, 5},
            {8, 3, 5},
            {9, 4, 5},
            {10, 5, 5},
            {-10, -15, 5},
        });
    }

    public ParameterizedExampleTest(int first, int second, int result) {
        this.first = first;
        this.second = second;
        this.result = result;
    }

    @Test
    public void add() {
        //passes
        assertEquals(result, Math.add(first, second));
    }

    @Test
    public void subtract() {
        //fails
        assertEquals(result, Math.subtract(first, second));
    }
}
