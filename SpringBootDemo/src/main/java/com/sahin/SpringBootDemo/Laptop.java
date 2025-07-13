package com.sahin.SpringBootDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Laptop {
    @Autowired
    Cpu cpu;

    void compile(){
        System.out.println("Compiling!!");
        cpu.running();
    }
}
