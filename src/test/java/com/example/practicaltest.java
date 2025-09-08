package com.example;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class practicaltest {

   
     @Test
    public void testAdd() {
        assertEquals(9, practicaltest.add(4, 5));
    }

    @Test
    public void testMultiply() {
        assertEquals(20, practicaltest.multiply(4, 5));
    }
}
