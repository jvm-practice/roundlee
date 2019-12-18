package com.example.demo;

import org.springframework.stereotype.Service;

@Service
public class CalculateService{

    public int add ( int a, int b ) {
       
        return a + b;
    }
}
