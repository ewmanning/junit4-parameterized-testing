package com.edwardmanning;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class ParameterizedSubtractTest extends ParameterizedAbstract {

    @Parameterized.Parameters()
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {
                {7, 2, 5},
                {8, 3, 5},
                {9, 4, 5},
                {10, 5, 5},
                {-10, -15, 5},
        });
    }

    public ParameterizedSubtractTest(int first, int second, int result) {
        super(first, second, result);
    }

    @Test
    public void subtract() {
        //fails
        assertEquals(result, Math.subtract(first, second));
    }
}
