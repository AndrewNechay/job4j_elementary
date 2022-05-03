package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class MaxTest {
    @Test
    public void whenMax1To2Then2() {
        int left = 1;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 2;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenOneMax() {
        int left = 4;
        int right = 2;
        int result = Max.max(left, right);
        int expected = left;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenSecondMax() {
        int left = 2;
        int right = 5;
        int result = Max.max(left, right);
        int expected = right;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenEqually() {
        int left = 2;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 2;
        Assert.assertEquals(result, expected);
    }
}