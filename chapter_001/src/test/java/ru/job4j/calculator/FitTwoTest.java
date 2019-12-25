package ru.job4j.calculator;

import org.junit.Assert;
import org.junit.Test;

public class FitTwoTest { 

 @Test
    public void manWeight() {
        int in = 180;
        int expected = 92;
        double out = FitTwo.manWeight(in);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void womanWeight() {
        int in = 170;
        int expected = 69;
        double out = FitTwo.womanWeight(in);
        Assert.assertEquals(expected, out, 0.01);
    }
} 