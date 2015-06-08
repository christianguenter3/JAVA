package com.company;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by guenterc on 08.06.2015.
 */
public class CheckStringAllUniqueCharsTest {

    CheckStringAllUniqueChars cut;

    @org.junit.Before
    public void setUp() throws Exception {
        cut = new CheckStringAllUniqueChars();
    }

    @Test
    public void testSimpleCase() {
        Assert.assertTrue(cut.hasAllUniqueChars("tex"));
    }

    @Test
    public void testSimpleNegativeCase(){
        Assert.assertFalse(cut.hasAllUniqueChars("TEST"));
    }

    @Test
    public void testCamelCase(){
        Assert.assertTrue(cut.hasAllUniqueChars("Test"));
    }
}