package com.springDemo.client;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springDemo.model.Customer;

public class Client {

	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"beans.xml","beans2.xml"});
		
		Customer customer = (Customer) context.getBean("cust");
//		Customer customer2 = (Customer) context.getBean("cust");	
		
		System.out.println(customer);
//		System.out.println(customer2);
		
		customer = null;
//		customer2 = null;
		
		context.registerShutdownHook();

	}

}
