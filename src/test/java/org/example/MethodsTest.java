package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MethodsTest {

    @Test
    void testAdd(){
        assertEquals(9,Methods.add(4,5));
    }

    @Test
    void testSubtract(){
        assertEquals(1,Methods.subtract(5,4));
    }

    void testMultiply(){}
}
