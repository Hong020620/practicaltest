package com.example;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class MainTest {

    @Test
    public void testAdd() {
        assertEquals(8, Main.add(3, 5));
    }

    @Test
    public void testMultiply() {
        assertEquals(15, Main.multiply(3, 5));
    }
}
