package com.sahin.SpringBootDemo.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Desktop implements Computer{
    @Autowired
    Cpu cpu;

    public  void compile(){
        System.out.println("Compiling in Desktop!!");
        cpu.running();
    }
}