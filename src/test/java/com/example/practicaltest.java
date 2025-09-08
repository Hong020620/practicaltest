package com.example;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class MainTest {

    @Test
    public void testAdd() {
        assertEquals(9, Main.add(4, 5));
    }

    @Test
    public void testMultiply() {
        assertEquals(20, Main.multiply(4, 5));
    }
}
