package com.vizron.bookstore.dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.vizron.bookstore.model.Category;
import com.vizron.bookstore.model.Supplier;
import com.vizron.bookstore.model.User;

public class UserDAOImpl implements UserDAO {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	public UserDAOImpl(SessionFactory sessionFactory) {
		super();
		this.sessionFactory = sessionFactory;
	}
	
	@Transactional
	public boolean save(User user) {
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
	public boolean update(User user) {
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
	public boolean delete(User user) {
		try {
			sessionFactory.getCurrentSession().delete(user);
			return true;
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
	}
	

	@Transactional
	public User get(String id){
		
		String hql="from Category where id="+" ' " + id +"'";
		Query query= sessionFactory.getCurrentSession().createQuery(hql);
		List<User> list=query.list();
		if(list==null){
			return null;
		}else {
			return list.get(0);
		}
	}

	@Transactional
	public List<User> list(){
		
		String hql="from User";
		Query query=sessionFactory.getCurrentSession().createQuery(hql);
		
		return query.list();
	}

}
