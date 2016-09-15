package com.vizron.bookshop.dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

import com.vizron.bookshop.model.Supplier;

@EnableTransactionManagement
@Repository("supplierDAO")
public class SupplierDAOImpl implements SupplierDAO{
	
	@Autowired
	private SessionFactory sessionFactory;
	
	
	
	public SupplierDAOImpl(SessionFactory sessionFactory) {
				this.sessionFactory = sessionFactory;
	}
	@Transactional
	public boolean save(Supplier supplier){
		
		try {
			sessionFactory.getCurrentSession().save(supplier);
			return true;
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		
	}
	public boolean update(Supplier supplier){
		
		try {
			sessionFactory.getCurrentSession().update(supplier);
			return true;
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		
	}
	public boolean delete(Supplier supplier){
		
		try {
			sessionFactory.getCurrentSession().delete(supplier);
			return true;
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		
	}
	public Supplier get(String id){
		
		String hql=" from Supplier where id = "+" '"+id+" ' ";
		Query query=sessionFactory.openSession().createQuery(hql);//.getCurrentSession().createQuery(hql);
		List<Supplier> list= query.list();
		
		if(list==null)
		{
			return null;
		}
		else
		{
			return list.get(0);
		}
		
	}
	public List<Supplier> list(){
		
		String hql=" from Supplier";
		Query query=sessionFactory.openSession().createQuery(hql);//.getCurrentSession().createQuery(hql);
		return query.list();
	}

}

