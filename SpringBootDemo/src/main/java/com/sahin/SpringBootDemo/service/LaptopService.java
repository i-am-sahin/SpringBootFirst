package com.sahin.SpringBootDemo.service;

import com.sahin.SpringBootDemo.repo.LaptopRepository;
import com.sahin.SpringBootDemo.model.Laptop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LaptopService {

@Autowired
    private LaptopRepository repo;
    public void addLaptop(Laptop lap) {
        repo.save(lap);
    }

    public boolean isGoodForProg(Laptop laptop){
        return true;
    }

}
