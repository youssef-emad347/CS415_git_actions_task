package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;

public class MathUtilsTest {

    @Test
    void testFactorialOfZero() {
        assertEquals(1, MathUtils.factorial(0), "0! should be 1");
    }

    @Test
    void testFactorialPositive() {
        assertEquals(120, MathUtils.factorial(5), "5! should be 120");
    }

    @Test
    void testFactorialNegativeThrows() {
        assertThrows(IllegalArgumentException.class, () -> MathUtils.factorial(-3));
    }

    // ---------- fibonacci tests ----------

    @Test
    void testFibonacciBaseCases() {
        assertEquals(0, MathUtils.fibonacci(0));
        assertEquals(1, MathUtils.fibonacci(1));
    }

    @Test
    void testFibonacciSequence() {
        assertEquals(5, MathUtils.fibonacci(5));
        assertEquals(13, MathUtils.fibonacci(7));
    }

    @Test
    void testFibonacciNegativeThrows() {
        assertThrows(IllegalArgumentException.class, () -> MathUtils.fibonacci(-1));
    }
}
