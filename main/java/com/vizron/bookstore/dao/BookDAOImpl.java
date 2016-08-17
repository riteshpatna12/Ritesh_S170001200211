package com.vizron.bookstore.dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

import com.vizron.bookstore.model.Book;
import com.vizron.bookstore.model.User;

@EnableTransactionManagement
@Repository("bookDAO")
public class BookDAOImpl implements BookDAO {
	 
	@Autowired
	private SessionFactory sessionFactory;
	
	public BookDAOImpl(SessionFactory sessionFactory) {
		
		this.sessionFactory = sessionFactory;
	}
	
	@Transactional
	public boolean save(Book book) {
			try {
				sessionFactory.getCurrentSession().save(book);
				return true;
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				return false;
			}
		}
	
	@Transactional
	public boolean update(Book book) {
		try {
			sessionFactory.getCurrentSession().update(book);
			return true;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
	}
	@Transactional
	public boolean delete(Book book) {
		try {
			sessionFactory.getCurrentSession().delete(book);
			return true;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
	}
	

	@Transactional
	public Book get(String bookId){
		
		String hql="from Book where bookId="+" ' " + bookId +"'";
		Query query= sessionFactory.openSession().createQuery(hql);
		List<Book> list=query.list();
		if(list==null || list.isEmpty()){
			return null;
		}else {
			return list.get(0);
		}
	}

	@Transactional
	public List<Book> list(){
		
		String hql="from Book";
		Query query= sessionFactory.openSession().createQuery(hql);
		
		return query.list();
	}

}
	

