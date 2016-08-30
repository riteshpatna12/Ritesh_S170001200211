package com.ichdbank.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

import com.ichdbank.model.Account;
import com.ichdbank.model.Customer;

@EnableTransactionManagement
@Repository("accountDAO")
public class AccountDAOImpl implements AccountDAO {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	public AccountDAOImpl(SessionFactory sessionFactory){
		
		this.sessionFactory=sessionFactory;
	}
	
	@Transactional
	public boolean save(Account account) {
		try {
			  sessionFactory.getCurrentSession().save(account);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	@Transactional
	public boolean update(Account account){
		try {
			sessionFactory.getCurrentSession().update(account);
			return true;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		
	}
	
	@Transactional
	public boolean delete(Account account){
		try {
			sessionFactory.getCurrentSession().delete(account);
			return true;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		
		
	}
	
	@Transactional
	public Customer get(String accountNumber){
		
		String hql="from Account where accountNumber= "+" ' " + accountNumber +"'";
		Query query= sessionFactory.getCurrentSession().createQuery(hql);
		List<Customer> list=query.list();
		if(list==null || list.isEmpty()){
			return null;
		}else{
			return list.get(0);
		}
	}
	
	@Transactional
	public List<Account> list(){
		
		String hql="from Account";
		Query query= sessionFactory.openSession().createQuery(hql);//.getCurrentSession().createQuery(hql);
		
		return query.list();
	}
	
}
