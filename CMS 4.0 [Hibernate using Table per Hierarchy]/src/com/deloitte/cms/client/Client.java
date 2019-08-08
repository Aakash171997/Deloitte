package com.deloitte.cms.client;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.deloitte.cms.model.Customer;
import com.deloitte.cms.model.PremiumCustomer;

@SuppressWarnings("unused")
public class Client {

	public static void main(String[] args) {
		Configuration configuration = new Configuration().configure();
		
		SessionFactory factory = configuration.buildSessionFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		
		PremiumCustomer customer = new PremiumCustomer(3, "Jack", "Miami", 35890);
		customer.setRewardPoints(258);
		session.save(customer);
		
		transaction.commit();
		session.close();
		factory.close();
		System.out.println(customer);

	}

}
