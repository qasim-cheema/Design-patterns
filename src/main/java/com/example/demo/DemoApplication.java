package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		ShapeFactory sp=new ShapeFactory();
		Shape shape= sp.getShape("circle");
		shape.draw();


	}

}
