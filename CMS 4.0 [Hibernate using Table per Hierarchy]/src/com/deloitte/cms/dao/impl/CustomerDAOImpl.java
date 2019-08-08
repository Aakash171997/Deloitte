package com.deloitte.cms.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

import com.deloitte.cms.dao.CustomerDAO;
import com.deloitte.cms.model.Customer;

public class CustomerDAOImpl implements CustomerDAO {
	
	private Session session = beginSession();
	
	private Session beginSession() {
		Configuration configuration = new Configuration().configure();
		
		SessionFactory factory = configuration.buildSessionFactory();
		Session session = factory.openSession();
		return session;
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Customer> getAllCustomers() {
		
		List<Customer> customerList = new ArrayList<Customer>();
		
		//Alternate version - useful for conditional select
		
		/* Query query = this.session.createQuery("from com.deloitte.cms.model.Customer");
		 * Iterator<Customer> iterator = query.iterate();
		 * 
		 * while(iterator.hasNext()){
		 * 		Customer customer = iterator.next();
		 * 		customerList.add(customer);
		 * }
		 */

		Criteria criteria = this.session.createCriteria(Customer.class);
		customerList = criteria.list();
		
		return customerList;
	}

	@Override
	public int insertCustomer(Customer customer) {
		int rows = 1;
		Transaction transaction = this.session.beginTransaction();
		
		this.session.save(customer);
		
		transaction.commit();
		return rows;
	}

	@Override
	public int updateCustomer(Customer customer) {
		int rows = 1;
		
		Session session = beginSession();
		Transaction transaction = session.beginTransaction();
		
		session.update(customer);
		
		transaction.commit();
		session.close();
		return rows;
		
	}

	@Override
	public int deleteCustomer(int customerId) {
		int rows = 1;
		
		Customer customer = new Customer(customerId);
		Session session = beginSession();
		Transaction transaction = session.beginTransaction();
		
		session.delete(customer);
		
		transaction.commit();
		session.close();
		return rows;
	}

	@Override
	public Customer seachCustomerById(int customerId) {
		Customer customer = null;
		Transaction transaction = this.session.beginTransaction();
		
		customer = (Customer) this.session.get(Customer.class, customerId);
		
		transaction.commit();
		
		return customer;
		
	}

	@Override
	public boolean customerExists(int customerId) {
		boolean customerExists = false;
		
		Customer customer = null;
		Transaction transaction = this.session.beginTransaction();
		
		customer = (Customer) this.session.get(Customer.class, customerId);
		
		transaction.commit();
		if(customer == null) {
			customerExists = false;
		} else {
			customerExists = true;
		}
		
		return customerExists;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Customer> getAllCustomersbyBillAmount(int minimum) {
		List<Customer> customerList = new ArrayList<Customer>();
		
		Criteria criteria = this.session.createCriteria(Customer.class);
		criteria.add(Restrictions.gt("customerId", minimum));
		customerList = criteria.list();
		
		return customerList;
	}
	
	@Override
	public Integer customerCount() {
		return (Integer) this.session.createQuery(""
				+"select count(customerId) from com.deloitte.cms.model.Customer"
				+"").uniqueResult();
	}
}
