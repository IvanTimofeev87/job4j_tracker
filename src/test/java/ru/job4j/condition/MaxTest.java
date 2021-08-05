package ru.job4j.condition;

import org.junit.Test;

import org.junit.Test;
import org.junit.Assert;

public class MaxTest {

    @Test
    public void when7and6and9() {
        int biggestNumberFromThree = Max.max(7, 6, 9);
        int expected = 9;
        Assert.assertEquals(expected, biggestNumberFromThree, 1);
    }

    @Test
    public void when7and6and8and4() {
        int biggestNumberFromFour = Max.max(6, 2, 8, 4);
        int expected = 8;
        Assert.assertEquals(expected, biggestNumberFromFour, 1);
    }
}