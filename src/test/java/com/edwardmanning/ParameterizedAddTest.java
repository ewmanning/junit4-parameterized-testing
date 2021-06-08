package com.edwardmanning;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class ParameterizedAddTest extends ParameterizedAbstract {

    @Parameterized.Parameters()
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {
                {3, 2, 5},
                {2, 3, 5},
                {1, 4, 5},
                {0, 5, 5},
                {-10, 15, 5}
        });
    }

    public ParameterizedAddTest(int first, int second, int result) {
        super(first, second, result);
    }

    @Test
    public void add() {
        //passes
        assertEquals(result, Math.add(first, second));
    }
}
