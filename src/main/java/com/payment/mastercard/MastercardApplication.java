package com.payment.mastercard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class MastercardApplication {

	public static void main(String[] args) {
		
		ApplicationContext myApp =  SpringApplication.run(MastercardApplication.class, args);
	
		System.out.println("hello world");
	}

}
