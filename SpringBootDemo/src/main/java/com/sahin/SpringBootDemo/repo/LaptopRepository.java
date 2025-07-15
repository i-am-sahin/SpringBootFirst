package com.sahin.SpringBootDemo.repo;

import com.sahin.SpringBootDemo.model.Laptop;
import org.springframework.stereotype.Repository;

@Repository
public class LaptopRepository {
    public void save(Laptop lap){
        System.out.println("Saved In database!");
    }
}
