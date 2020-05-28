package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTwoTest {

    @Test
    public void distance0020() {
        PointTwo a = new PointTwo(0, 0);
        PointTwo b = new PointTwo(2, 0);
        double result = a.distance(b);
        double expected = 2;
        Assert.assertEquals(result, expected, 0.01);
    }

    @Test
    public void distance330044() {
        PointTwo a = new PointTwo(33, 0);
        PointTwo b = new PointTwo(0, 44);
        double result = a.distance(b);
        double expected = 55;
        Assert.assertEquals(result, expected, 0.01);
    }

    @Test
    public void distance011600() {
        PointTwo a = new PointTwo(0, 11);
        PointTwo b = new PointTwo(60, 0);
        double result = a.distance(b);
        double expected = 61;
        Assert.assertEquals(result, expected, 0.01);
    }

    @Test
    public void distance4352() {
        PointTwo a = new PointTwo(4, 3);
        PointTwo b = new PointTwo(5, 2);
        double result = a.distance(b);
        double expected = 1.41;
        Assert.assertEquals(result, expected, 0.01);
    }

    @Test
    public void distance2360() {
        PointTwo a = new PointTwo(-2, -3);
        PointTwo b = new PointTwo(-6, 0);
        double result = a.distance(b);
        double expected = 5;
        Assert.assertEquals(result, expected, 0.01);
    }
}

