package com.vizron.bookstore.config;

import java.util.Properties;

import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate4.LocalSessionFactoryBuilder;
import org.springframework.orm.hibernate4.HibernateTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.vizron.bookstore.dao.BookDAO;
import com.vizron.bookstore.dao.BookDAOImpl;
import com.vizron.bookstore.dao.CategoryDAO;
import com.vizron.bookstore.dao.CategoryDAOImpl;
import com.vizron.bookstore.dao.OrderDAO;
import com.vizron.bookstore.dao.OrderDAOImpl;
import com.vizron.bookstore.dao.SupplierDAO;
import com.vizron.bookstore.dao.SupplierDAOImpl;
import com.vizron.bookstore.dao.UserDAO;
import com.vizron.bookstore.dao.UserDAOImpl;
import com.vizron.bookstore.model.Book;
import com.vizron.bookstore.model.Category;
import com.vizron.bookstore.model.Order;
/*import com.vizron.bookstore.dao.CategoryDAO;
import com.vizron.bookstore.dao.CategoryDAOImpl;
*/
import com.vizron.bookstore.model.Supplier;
import com.vizron.bookstore.model.User;

@Configuration
@ComponentScan("com.vizron.bookstore")
@EnableTransactionManagement
public class ApplicationContextConfig {
	
	@Bean(name ="dataSource")
	public DataSource getDataSource(){
		
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
    	dataSource.setDriverClassName("org.h2.Driver");
    	dataSource.setUrl("jdbc:h2:tcp://localhost/~/test");
    	dataSource.setUsername("sa");
    	dataSource.setPassword("");
    	
    	return dataSource;
	}
	
	 private Properties getHibernateProperties() {
	    	Properties properties = new Properties();
	    	properties.put("hibernate.show_sql", "true");
	    	properties.put("hibernate.dialect", "org.hibernate.dialect.H2Dialect");
	    	properties.put("hibernate.hbm2ddl.auto","update");
	    	return properties;
	    }
	 
	 	 
	    @Autowired
	    @Bean(name = "sessionFactory")
	    public SessionFactory getSessionFactory(DataSource dataSource) {
	    	LocalSessionFactoryBuilder sessionBuilder = new LocalSessionFactoryBuilder(dataSource);
	    	sessionBuilder.addProperties(getHibernateProperties());
	    	sessionBuilder.addAnnotatedClasses(Category.class);
	    	sessionBuilder.addAnnotatedClasses(Supplier.class);
	    	sessionBuilder.addAnnotatedClasses(Book.class);
	    	sessionBuilder.addAnnotatedClasses(User.class);
	    	sessionBuilder.addAnnotatedClasses(Order.class);
	    	
	    	return sessionBuilder.buildSessionFactory();
	    }
	    
		@Autowired
		@Bean(name = "transactionManager")
		public HibernateTransactionManager getTransactionManager(
				SessionFactory sessionFactory) {
			HibernateTransactionManager transactionManager = new HibernateTransactionManager(
					sessionFactory);

			return transactionManager;
		}
	    
	    @Autowired
	    @Bean(name = "categoryDAO")
	    public CategoryDAO geCategoryDAO(SessionFactory sessionFactory) {
	    	return new CategoryDAOImpl(sessionFactory);
	    }

	    @Autowired
	    @Bean(name = "supplierDAO")
	    public SupplierDAO getSupplierDAO(SessionFactory sessionFactory) {
	    	return new SupplierDAOImpl(sessionFactory);
	    }
	    
	    @Autowired
	    @Bean(name = "bookDAO")
	    public BookDAO getBookDAO(SessionFactory sessionFactory) {
	    	return new BookDAOImpl(sessionFactory);
	    }
	    
	    @Autowired
	    @Bean(name = "userDAO")
	    public UserDAO getUserDAO(SessionFactory sessionFactory) {
	    	return new UserDAOImpl(sessionFactory);
	    }
	    
	    @Autowired
	    @Bean(name = "orderDAO")
	    public OrderDAO getOrderDAO(SessionFactory sessionFactory) {
	    	return new OrderDAOImpl(sessionFactory);
	    }

	}