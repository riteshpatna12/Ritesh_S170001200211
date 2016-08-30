package com.vizron.spring.dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;
import org.hibernate.Query;
import org.hibernate.Session;

import com.vizron.bookstore.model.Category;

@EnableTransactionManagement
@Repository("categoryDAO")
public class CategoryDAOImpl implements CategoryDAO {
		
		@Autowired
		private SessionFactory sessionFactory;
		
		
		public CategoryDAOImpl(SessionFactory sessionFactory){
			
			this.sessionFactory=sessionFactory;
		}

		@Transactional
		public void addBook(Category category) {
				Session session=this.sessionFactory.getCurrentSession();
				session.persist(category);
				logger.info("added successfully. Category Details:"+category);
			}
		
		@Transactional
		public void updateBook(Category category) {
			Session session=this.sessionFactory.getCurrentSession();
			session.update(book);
			logger.info("updated successfully. Category Details:"+category);
		}
		
		@Transactional
		public void delete(Category category) {
			Session session=this.sessionFactory.getCurrentSession();
			Category category=(Category)session.load(Category.class,new Integer(categoryId));
			if(category!=null){		
			session.remove(category);
			logger.info("Removed Successfully");
		}
		}

		@Transactional
		public Category getCategoryById(String categoryId){
			Session session=this.sessionFactory.getCurrentSession();
			Category category=(Category)session.load(Category.class,new Integer(categoryId));
			logger.info("Category loaded Successfully, Category Details"+category);
			return Category;
			
		}

		@Transactional
		public List<Category> list(){
			Session session=this.sessionFactory.getCurrentSession();
			List<Category> categoryList=session.createQuery("from Category").list();
			for(Category category:categoryList){
				logger.info("Category list::"+category);
			}
			return categoryList;
		}

	}
		

