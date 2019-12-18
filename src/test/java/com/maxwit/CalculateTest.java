package com.maxwit;

import org.junit.Assert;
import org.junit.Test;

public class CalculateTest{

    @Test
    public void AnswerWithTrue(){
        Assert.assertTrue(true);

    }

    @Test
    public void sumTest(){
        Calculate cal = new Calculate();
        int item = cal.add(3, 4);
        Assert.assertEquals(7, item);

    }



}
