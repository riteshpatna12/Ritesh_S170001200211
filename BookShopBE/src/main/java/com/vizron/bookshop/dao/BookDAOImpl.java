package com.vizron.bookshop.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

import com.vizron.bookshop.model.Book;

@EnableTransactionManagement
@Repository("bookDAO")
public class BookDAOImpl implements BookDAO {
	
	

	@Autowired
	private SessionFactory sessionFactory;
	
	public  BookDAOImpl(SessionFactory sessionFactory)
	{
		this.sessionFactory=sessionFactory;
	}
	
	@Transactional
	public boolean save(Book book) 
	{
		try {
			sessionFactory.getCurrentSession().save(book);
			return true;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
	}

	public boolean update(Book book)
	{
		try {
			sessionFactory.getCurrentSession().update(book);
			return true;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		
	}

	public boolean delete(Book book)
	{
		try {
			sessionFactory.getCurrentSession().delete(book);
			return true;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
	}
	public Book get(String id) 
	{
		//select * from catogory where id='101';
		String hql=" from Book where id= '"+id+"'";
		
		@SuppressWarnings("deprecation")
		Query query=sessionFactory.openSession().createQuery(hql);//.getCurrentSession().createQuery(hql);
		
		List<Book> list= query.list();
		
		if(list==null || list.isEmpty())
		{
			return null;
		}
		else
		{
			return list.get(0);
		}
		
	}

	public List<Book> list() 
		{
			
			String hql="from Book";
			
			@SuppressWarnings("deprecation")
			Query query=sessionFactory.openSession().createQuery(hql);//.getCurrentSession().createQuery(hql);
			return query.list();
			
		}
		
	}

