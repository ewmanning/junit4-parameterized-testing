package com.edwardmanning;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class ParameterizedAddTest {
    private final MathDTO dto;

    @Parameterized.Parameters()
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {new MathDTO(3, 2, 5)},
                {new MathDTO(2, 3, 5)},
                {new MathDTO(1, 4, 5)},
                {new MathDTO(0, 5, 5)},
                {new MathDTO(-10, -15, 5)}
        });
    }

    public ParameterizedAddTest(MathDTO dto) {
        this.dto = dto;
    }

    @Test
    public void add() {
        assertEquals(dto.result, Math.add(dto.first, dto.second));
    }

    public static class MathDTO {
        private final int first;
        private final int second;
        private final int result;

        public MathDTO(int first, int second, int result) {
            this.first = first;
            this.second = second;
            this.result = result;
        }
    }
}
