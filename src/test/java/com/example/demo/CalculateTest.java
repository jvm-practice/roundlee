package com.example.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import static org.junit.Assert.*;


@RunWith(SpringRunner.class)
@SpringBootTest
public class CalculateTest{

    @Autowired
    private CalculateService calculateService;

    public void answerWithTrue(){
        assertTrue(true);
    }

    @Test
    public void sumTest(){
       
        assertEquals(7, calculateService.add(3, 4));

    }
}
