package com.sahin.SpringBootDemo;

import com.sahin.SpringBootDemo.model.Alien;
import com.sahin.SpringBootDemo.model.Laptop;
import com.sahin.SpringBootDemo.service.LaptopService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootDemoApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringBootDemoApplication.class, args);


		LaptopService service = context.getBean(LaptopService.class);
		Laptop lap = context.getBean(Laptop.class);
		service.addLaptop(lap);





//		Alien obj = new Alien();
//		obj.code();
		//Creating Objects with help of SpringBoot
//		Alien obj = context.getBean(Alien.class);
//		obj.code();
//		System.out.println(obj.getAge());
//		Laptop lap = context.getBean(Laptop.class);
//		lap.compile();

//		Cpu cpu = context.getBean(Cpu.class);
//		cpu.running();

	}

}
