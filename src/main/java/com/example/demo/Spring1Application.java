package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.demo.one.Employe_P;

@SpringBootApplication
public class Spring1Application {

	public static void main(String[] args) {
	   SpringApplication.run(Spring1Application.class, args);
	   //Employe_P em=con.getBean(Employe_P.class);
	}

}
