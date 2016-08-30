package com.ichdbank.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

import com.ichdbank.dao.CustomerDAO;
import com.ichdbank.model.Customer;



@EnableTransactionManagement
@Repository("customerDAO")
public class CustomerDAOImpl implements CustomerDAO {
	
	@Autowired
	private SessionFactory sessionFactory;    
	
	public CustomerDAOImpl(SessionFactory sessionFactory){
		
		this.sessionFactory=sessionFactory;
	}
	
	
	@Transactional
	public boolean save(Customer customer){
		
		try {
			  sessionFactory.getCurrentSession().save(customer);
			return true;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		
	}

	@Transactional
	public boolean update(Customer customer){
		try {
			sessionFactory.getCurrentSession().update(customer);
			return true;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		
	}
	
	@Transactional
	public boolean delete(Customer customer){
		try {
			sessionFactory.getCurrentSession().delete(customer);
			return true;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		
		
	}
	
	@Transactional
	public Customer get(String customerId){
		
		String hql="from Customer where customerId= "+" ' " + customerId +"'";
		Query query= sessionFactory.getCurrentSession().createQuery(hql);
		List<Customer> list=query.list();
		if(list==null || list.isEmpty()){
			return null;
		}else{
			return list.get(0);
		}
	}
	
	@Transactional
	public List<Customer> list(){
		
		String hql="from Customer";
		Query query= sessionFactory.openSession().createQuery(hql);//.getCurrentSession().createQuery(hql);
		
		return query.list();
	}
	


}
