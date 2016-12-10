package ru.javawebinar.topjava.util;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalTime;

public class TimeUtilTests {
    @Test

    public void testOne() {


        boolean result = TimeUtil.isBetween(LocalTime.now(), LocalTime.of(10, 0), LocalTime.of(23, 35));
        Assert.assertTrue(result);


    }


}