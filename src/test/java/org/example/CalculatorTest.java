package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorTest {

    @Test
    void testAdd(){
        assertEquals(10,Calculator.add(7,3));
    }

    @Test
    void testSubtract(){
        assertEquals(4,Calculator.subtract(7,3));
    }

    @Test
    void testMultiply(){
        assertEquals(21,Calculator.multiply(7,3));
    }

    @Test
    void testDivide() {
        assertEquals(2, Calculator.divide(6, 3));
    }

    @Test
    void testRemainder() {
        assertEquals(1, Calculator.remainder(7, 3));
    }

    @Test
    void testDivideByZero() {
        assertThrows(IllegalArgumentException.class, () -> {
            Calculator.divide(10, 0);
        });
    }
}
