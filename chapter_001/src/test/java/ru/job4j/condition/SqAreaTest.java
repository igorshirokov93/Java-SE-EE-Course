package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class SqAreaTest {

    @Test
    public void square1() {
        SqArea area = new SqArea();
        double result = area.square(4, 1);
        double expected = 1;
        Assert.assertEquals(result, expected, 0.01);
    }

    @Test
    public void square2() {
        SqArea area = new SqArea();
        double result = area.square(6, 2);
        double expected = 2;
        Assert.assertEquals(result, expected, 0.01);
    }
}