package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class TriangleTest {

    @Test
    public void whenExist() {
        boolean ab = true;
        boolean ac = true;
        boolean bc = true;
        boolean result = Triangle.exist(ab, ac, bc);
        Assert.assertTrue(result);
    }

    @Test
    public void whenNotExist() {
        boolean ab = false;
        boolean ac = false;
        boolean bc = false;
        boolean result = Triangle.exist(ab, ac, bc);
        Assert.assertFalse(result);
    }
}