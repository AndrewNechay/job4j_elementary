package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class SqAreTest {
    @Test
    public void whenP6K2Square2() {
        int expected = 2;
        int p = 6;
        double k = 2;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP4K1Square1() {
        int expected = 1;
        int p = 4;
        double k = 1;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP12dot5K5dot5Square5dot085() {
        double expected = 5.085;
        double p = 12.5;
        double k = 5.5;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP23dot87K110Square1dot271() {
        double expected = 1.271;
        double p = 23.87;
        double k = 110;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }
}