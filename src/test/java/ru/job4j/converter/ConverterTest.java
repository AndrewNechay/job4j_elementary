package ru.job4j.converter;

import org.junit.Assert;

import org.junit.Test;

public class ConverterTest {

    @Test
    public void whenConvert140RblThen2Euro() {
        float in = 140;
        float expenced = 2;
        float out = Converter.rubleToEuro(in);
        float eps = 0.0001f;
        Assert.assertEquals(expenced, out, eps);

    }

    @Test
    public void whenConvert180RblThen3Dlr() {
        float in = 180;
        float expenced = 3;
        float out = Converter.rubleToDollar(in);
        float eps = 0.0001f;
        Assert.assertEquals(expenced, out, eps);
    }
}