package com.vizron.bookshop.dao;

import java.util.List;


import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

import com.vizron.bookshop.model.Category;

@EnableTransactionManagement
@Repository("categoryDAO")
public class CategoryDAOImpl implements CategoryDAO{
	
		
	@Autowired
	private SessionFactory sessionFactory;
	
	public  CategoryDAOImpl(SessionFactory sessionFactory)
	{
		this.sessionFactory=sessionFactory;
	}

	@Transactional
	public boolean save(Category category)
	{
		try {
			//log.debug("Starting of the save ");
			sessionFactory.getCurrentSession().save(category);
			return true;
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			//log.error("Exception occured in save() "+e.getMessage());
			e.printStackTrace();
			return false;
		}
	}
	@Transactional
	public boolean update(Category category)
	{
		try {
			sessionFactory.getCurrentSession().update(category);
			return true;
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		
	}
	@Transactional
	public boolean delete(Category category)
	{
		try {
			sessionFactory.getCurrentSession().delete(category);
			return true;
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
	}
	
	
	public Category get(String id)
	{
		//select * from catogory where id='101';
		//log.debug("starting of get()");
		//log.info("trying to get category of id : "+id);
		String hql=" from Category where id= '"+id+"'";
		
		//log.info("hql is :" +hql);
		
		@SuppressWarnings("deprecation")
		Query query=sessionFactory.openSession().createQuery(hql);//.getCurrentSession().createQuery(hql);
		
		List<Category> list= query.list();
		
		if(list==null || list.isEmpty())
		{
			//log.debug("No categories are available");
			return null;
		}
		else
		{
			return list.get(0);
		}
		
	}
	public List<Category> list()
	{
		
String hql="from Category";
		
		@SuppressWarnings("deprecation")
		Query query=sessionFactory.openSession().createQuery(hql);//.getCurrentSession().createQuery(hql);
		return (List<Category>) query.list();
		
		
	}
	
}
