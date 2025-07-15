package com.sahin.SpringBootDemo.service;

import com.sahin.SpringBootDemo.model.Laptop;
import org.springframework.stereotype.Service;

@Service
public class LaptopService {

    public void addLaptop(Laptop lap) {
        System.out.println("Method Called!");
    }

    public boolean isGoodForProg(Laptop laptop){
        return true;
    }

}
