package com.springDemo.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.springDemo.model.Address;
import com.springDemo.model.Customer;

@Configuration
public class AppConfiguration {
	
	@Bean
	@Scope("singleton")
	public Customer getCustomerObject() {
		return new Customer();
	}
	
	@Bean
	public Address getAddressObject() {
		return new Address();
	}
}
