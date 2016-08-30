package com.vizron.spring.dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

import com.vizron.bookstore.model.Book;
import com.vizron.bookstore.model.User;

@EnableTransactionManagement
@Repository("bookDAO")
public class BookDAOImpl implements BookDAO {
	
	private static final Logger logger=LoggerFactory.getLogger(BookDAOImpl.class);
	 
	@Autowired
	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sessionFactory) {
		
		this.sessionFactory = sessionFactory;
	}
	
	@Transactional
	public void addBook(Book book) {
			Session session=this.sessionFactory.getCurrentSession();
			session.persist(book);
			logger.info("added successfully. Book Details:"+book);
		}
	
	@Transactional
	public void updateBook(Book book) {
		Session session=this.sessionFactory.getCurrentSession();
		session.update(book);
		logger.info("updated successfully. Book Details:"+book);
	}
	
	@Transactional
	public void delete(Book book) {
		Session session=this.sessionFactory.getCurrentSession();
		Book book=(Book)session.load(Book.class,new Integer(bookId));
		if(book!=null){		
		session.remove(book);
		logger.info("Removed Successfully");
	}
	}

	@Transactional
	public Book getBookById(String bookId){
		Session session=this.sessionFactory.getCurrentSession();
		Book book=(Book)session.load(Book.class,new Integer(bookId));
		logger.info("Book loaded Successfully, Book Details"+book);
		return Book;
		
	}

	@Transactional
	public List<Book> list(){
		Session session=this.sessionFactory.getCurrentSession();
		List<Book> booksList=session.createQuery("from BOOK").list();
		for(Book book:booksList){
			logger.info("Books list::"+book);
		}
		return booksList;
	}

}
	

