package com.springDemo.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.springDemo.Config.AppConfiguration;
import com.springDemo.model.Address;
import com.springDemo.model.Customer;

@SuppressWarnings("unused")
public class Client {

	public static void main(String[] args) {
		AbstractApplicationContext context = new AnnotationConfigApplicationContext(AppConfiguration.class);
		
		Customer customer = context.getBean(Customer.class);
		Address address = context.getBean(Address.class);
		
		customer.setCustomerId(1872);
		customer.setCustomerName("Anwesh");
		customer.setCustomerAddress("Jharsuguda");
		customer.setBillAmount(65432);
		
		address.setAddressId(6546);
		address.setCity("Jharsuguda");
		address.setState("Odisha");
		address.setZip(768203);
		
		//customer.setAddress(address);
		
		System.out.println(customer);
		
		customer = null;
		
		context.registerShutdownHook();

	}

}
