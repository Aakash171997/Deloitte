package com.deloitte.cms.client;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.deloitte.cms.model.Customer;

@SuppressWarnings("unused")
public class Client {

	public static void main(String[] args) {
		Configuration configuration = new Configuration().configure();
		
		SessionFactory factory = configuration.buildSessionFactory();
		Session session = factory.openSession();
//		Transaction transaction = session.beginTransaction();
//		
//		Customer customer = new Customer(9018, "Samwell", "Old Town", 132346);
//		
//		session.save(customer);
//		@SuppressWarnings("unchecked")
//		List<Customer> allCusts = session.createCriteria(Customer.class).list();
//		
//		for(Customer c: allCusts) {
//			System.out.println(c);
//		}
//		
//		transaction.commit();
		
		Transaction transaction = session.beginTransaction();
		
		Customer customer = (Customer) session.get(Customer.class, 912836);
		System.out.println(customer);
		customer.setCustomerName("Rathore");
		customer.setCustomerAddress("Ahmedabad");
		
		transaction.commit();
		session.close();
		factory.close();
		System.out.println(customer);

	}

}
