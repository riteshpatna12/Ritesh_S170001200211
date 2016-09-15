package com.vizron.bookshop.dao;

import java.util.List;


import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

import com.vizron.bookshop.model.User;

@EnableTransactionManagement
@Repository("userDAO")
public class UserDAOImpl implements UserDAO{
	
	@Autowired
	private SessionFactory sessionFactory;
	
	public  UserDAOImpl(SessionFactory sessionFactory)
	{
		this.sessionFactory=sessionFactory;
	}

	@Transactional
	public boolean save(User user)
	{
		try {
			sessionFactory.getCurrentSession().save(user);
			return true;
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
	}
	@Transactional
	public boolean update(User user)
	{
		try {
			sessionFactory.getCurrentSession().update(user);
			return true;
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		
	}
	@Transactional
	public boolean delete(User user)
	{
		try {
			sessionFactory.getCurrentSession().delete(user);
			return true;
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
	}
	
	
	public User get(String id)
	{
		//select * from catogory where id='101';
		String hql=" from User where id= '"+id+"'";
		
		@SuppressWarnings("deprecation")
		Query query=sessionFactory.openSession().createQuery(hql);//.getCurrentSession().createQuery(hql);
		
		List<User> list= query.list();
		
		if(list==null)
		{
			return null;
		}
		else
		{
			return list.get(0);
		}
		
	}
	@Transactional
	public User isValidUser(String id, String password)
	{
		String hql="from user where id='"+id+"' and password='"+password+"'";
		Query query=sessionFactory.openSession().createQuery(hql);//.getCurrentSession().createQuery(hql);
		List<User> list= query.list();
		if(list==null)
		{
			return null;
		}
		else
		{
			return list.get(0);
		}
		
	}
	public List<User> list()
	{
		
		String hql="from User";
		
		@SuppressWarnings("deprecation")
		Query query=sessionFactory.openSession().createQuery(hql);//.getCurrentSession().createQuery(hql);
		return (List<User>) query.list();
		
		
	}
	
}
