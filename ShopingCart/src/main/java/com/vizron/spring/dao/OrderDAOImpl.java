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
@Repository("orderDAO")
public class OrderDAOImpl implements OrderDAO {
	
	private static final Logger logger=LoggerFactory.getLogger(OrderDAOImpl.class);
	 
	@Autowired
	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sessionFactory) {
		
		this.sessionFactory = sessionFactory;
	}
	
	@Transactional
	public void addBook(Order order) {
			Session session=this.sessionFactory.getCurrentSession();
			session.persist(order);
			logger.info("added successfully. Book Details:"+order);
		}
	
	@Transactional
	public void updateBook(Order order) {
		Session session=this.sessionFactory.getCurrentSession();
		session.update(order);
		logger.info("updated successfully. Book Details:"+order);
	}
	
	@Transactional
	public void delete(Order order) {
		Session session=this.sessionFactory.getCurrentSession();
		Order order=(Order)session.load(Order.class,new Integer(orderId));
		if(order!=null){		
		session.remove(order);
		logger.info("Removed Successfully");
	}
	}

	@Transactional
	public Book getOrderById(String orderId){
		Session session=this.sessionFactory.getCurrentSession();
		Order order=(Order)session.load(Order.class,new Integer(orderId));
		logger.info("Order loaded Successfully, Order Details"+order);
		return Order;
		
	}

	@Transactional
	public List<Order> listOrders(){
		Session session=this.sessionFactory.getCurrentSession();
		List<Order> ordersList=session.createQuery("from Order").list();
		for(Order order:ordersList){
			logger.info("Orders list::"+order);
		}
		return ordersList;
	}

}
	

