package com.deloitte.client;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.deloitte.model.Address;
import com.deloitte.model.EmployeeDetails;

public class ClientApp {

	public static void main(String[] args) {
		Configuration configuration = new Configuration().configure();
		SessionFactory factory = configuration.buildSessionFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		
		Set<Address> allAddress = new HashSet<Address>();
		
		EmployeeDetails emp1 = new EmployeeDetails(1, "Arun", 990000);
		EmployeeDetails emp2 = new EmployeeDetails(2, "Varun", 950000);
		EmployeeDetails emp3 = new EmployeeDetails(3, "Tarun", 1090000);
		
		Address address1 = new Address(1, "Hyderabad", "Telengana");
		Address address2 = new Address(2, "Bengaluru", "Karnataka");
		
		allAddress.add(address1);
		allAddress.add(address2);
		
		emp1.setEmployeeAddress(allAddress);
		emp2.setEmployeeAddress(allAddress);
		
		session.save(emp1);
		session.save(emp2);
		session.save(emp3);
		
		transaction.commit();
		session.close();
		factory.close();
		
	}

}
