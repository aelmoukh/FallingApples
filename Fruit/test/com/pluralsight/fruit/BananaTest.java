package com.pluralsight.fruit;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by David Starr.
 */
public class BananaTest {

    private Banana banana;

    @Before
    public void BeforeEach() {
        banana = new Banana();
    }

    @Test
    public void BananaNameTest() {

        Assert.assertEquals("Banana", banana.getName());
    }

    @Test
    public void BananaRollMutiplierTest() {

        Assert.assertEquals(0, banana.getRollMultiplier());
    }



}
