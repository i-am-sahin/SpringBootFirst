package com.sahin.SpringBootDemo.model;

import org.springframework.stereotype.Component;

@Component
public class Cpu {
    public void running(){
        System.out.println("Cpu is running for compiling the Code!");
    }
}
