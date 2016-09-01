package com.vizron.bookstore.dao;

	import java.util.List;

	import org.hibernate.HibernateException;
	import org.hibernate.Query;
	import org.hibernate.SessionFactory;
	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.transaction.annotation.Transactional;
	import com.vizron.bookstore.model.Order;
	

		public class OrderDAOImpl implements OrderDAO {
	
			@Autowired
				private SessionFactory sessionFactory;
	
    	public OrderDAOImpl(SessionFactory sessionFactory) {
		
    		this.sessionFactory = sessionFactory;
	}
	
    		@Transactional
    			public boolean save(Order order) {
    				try {
    					sessionFactory.getCurrentSession().save(order);
    					return true;
    				} catch (Exception e) {
    					// TODO Auto-generated catch block
    					e.printStackTrace();
    					return false;
			}
		}
	
	@Transactional
	public boolean update(Order order) {
		try {
			sessionFactory.getCurrentSession().update(order);
			return true;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
	}
	@Transactional
	public boolean delete(Order order) {
		try {
			sessionFactory.getCurrentSession().delete(order);
			return true;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
	}
	

	@Transactional
	public Order get(String orderId){
		
		String hql="from User where orderId="+" ' " + orderId +"'";
		Query query= sessionFactory.openSession().createQuery(hql);//getCurrentSession().createQuery(hql);
		List<Order> list=query.list();
		if(list==null){
			return null;
		}else {
			return list.get(0);
		}
	}

	@Transactional
	public List<Order> list(){
		
		String hql="* from Order";
		Query query= sessionFactory.openSession().createQuery(hql);
		
		return query.list();
	}

}
