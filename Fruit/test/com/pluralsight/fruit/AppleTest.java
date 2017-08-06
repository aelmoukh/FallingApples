package com.pluralsight.fruit;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


/**
 * Created by David Starr.
 */
public class AppleTest {

    private Apple apple;

    @Before
    public void Before() {
        apple = new Apple();
    }


    @Test
    public void appleSaysApple() {
        Assert.assertEquals("Apple", apple.getName());
    }

    @Test
    public void rollMultiplierIs10() {
        Assert.assertEquals(10, apple.getRollMultiplier());
    }
}
