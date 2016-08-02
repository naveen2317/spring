package com.envy.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.envy.config.AppConfig;
import com.envy.customer.services.CustomerService;
import com.envy.hello.Hello;
import com.envy.hello.impl.HelloWorld;

public class App {
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("SpringBeans.xml");

		HelloWorld obj = (HelloWorld) context.getBean("helloBean");
		obj.printHello();
		
		CustomerService cust = (CustomerService) context.getBean("customerService");

		System.out.println("*************************");
		cust.printName();
		System.out.println("*************************");
		cust.printURL();
		System.out.println("*************************");
		try {
			cust.printThrowException();
		} catch (Exception e) {

		}

		
		
		
		ApplicationContext context1 = new AnnotationConfigApplicationContext(AppConfig.class);
	    Hello obj1 = (Hello) context1.getBean("hello");
	    
	    obj1.printHello("Spring3 Java Config");
		
	}
}