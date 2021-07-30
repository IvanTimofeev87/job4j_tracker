package ru.job4j.condition;

import org.junit.Test;
import org.junit.Assert;

public class PointTest {

    @Test
    public void when00to02then() {
        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        double expected = 2.0;
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when36to23then() {
        Point a = new Point(3, 6);
        Point b = new Point(2, 3);
        double expected = 3.162;
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.001);
    }

    @Test
    public void when66to23then() {
        Point a = new Point(6, 6);
        Point b = new Point(2, 3);
        double expected = 5;
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.001);
    }

}