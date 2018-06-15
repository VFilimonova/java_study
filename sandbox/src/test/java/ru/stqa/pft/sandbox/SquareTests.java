package ru.stqa.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;


public class SquareTests {

    @Test
    public void testAria() {
        Square s = new Square(5);
        Assert.assertEquals(s.aria(), 25.0);
    }
}


