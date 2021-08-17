package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
	
	public int addNum(int a,int b) {
		return a+b;
	}
	
	public int divideNum(int a,int b) {
		return a/b;
	}
	
	public String concatName(String a, String b) {
		return a+b;
	}

}
