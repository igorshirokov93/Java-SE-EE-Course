package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTwoTest {

    @Test
    public void distance0020() {
        PointTwo point = new PointTwo();
        double result = point.distance(0, 0, 2, 0);
        double expected = 2;
        Assert.assertEquals(result, expected, 0.01);
    }

    @Test
    public void distance330044() {
        PointTwo point = new PointTwo();
        double result = point.distance(33, 0, 0, 44);
        double expected = 55;
        Assert.assertEquals(result, expected, 0.01);
    }

    @Test
    public void distance011600() {
        PointTwo point = new PointTwo();
        double result = point.distance(0, 11, 60, 0);
        double expected = 61;
        Assert.assertEquals(result, expected, 0.01);
    }

    @Test
    public void distance4352() {
        PointTwo point = new PointTwo();
        double result = point.distance(4, 3, 5, 2);
        double expected = 1.41;
        Assert.assertEquals(result, expected, 0.01);
    }

    @Test
    public void distance2360() {
        PointTwo point = new PointTwo();
        double result = point.distance(-2, -3, -6, 0);
        double expected = 5;
        Assert.assertEquals(result, expected, 0.01);
    }
}

