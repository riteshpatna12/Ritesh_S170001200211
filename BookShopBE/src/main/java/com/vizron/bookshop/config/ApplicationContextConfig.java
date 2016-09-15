package com.vizron.bookshop.config;

import java.util.Properties;

import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.hibernate4.HibernateTransactionManager;
import org.springframework.orm.hibernate4.LocalSessionFactoryBuilder;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.vizron.bookshop.dao.BookDAO;
import com.vizron.bookshop.dao.BookDAOImpl;
import com.vizron.bookshop.dao.CategoryDAO;
import com.vizron.bookshop.dao.CategoryDAOImpl;
import com.vizron.bookshop.dao.SupplierDAO;
import com.vizron.bookshop.dao.SupplierDAOImpl;
import com.vizron.bookshop.dao.UserDAO;
import com.vizron.bookshop.dao.UserDAOImpl;
import com.vizron.bookshop.model.Book;
import com.vizron.bookshop.model.Category;
import com.vizron.bookshop.model.Supplier;
import com.vizron.bookshop.model.User;


@Configuration
@ComponentScan("com.vizron")
@EnableTransactionManagement
public class ApplicationContextConfig {
	
	 @Bean(name = "dataSource")
	    public DataSource getDataSource() {
	    	BasicDataSource dataSource = new BasicDataSource();
	    	dataSource.setDriverClassName("org.h2.Driver");
	    	dataSource.setUrl("jdbc:h2:tcp://localhost/~/dbshop");
	    	dataSource.setUsername("sa");
	    	dataSource.setPassword("");
	    	
	    	return dataSource;
	    }
	    
	    
	    private Properties getHibernateProperties() {
	    	Properties properties = new Properties();
	    	properties.put("hibernate.show_sql", "true");
	    	properties.put("hibernate.dialect", "org.hibernate.dialect.H2Dialect");
	    	properties.put("hibernate.hdbm2ddl.auto","update");
	    	
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
	    public CategoryDAO geCategoryDao(SessionFactory sessionFactory) {
	    	return new CategoryDAOImpl(sessionFactory);
	    }

	    @Autowired
	    @Bean(name = "bookDAO")
	    public BookDAO geBookDao(SessionFactory sessionFactory) {
	    	return new BookDAOImpl(sessionFactory);
	    }
	
	    @Autowired
	    @Bean(name = "supplierDAO")
	    public SupplierDAO geSupplierDao(SessionFactory sessionFactory) {
	    	return new SupplierDAOImpl(sessionFactory);
	    }

	    @Autowired
	    @Bean(name = "userDAO")
	    public UserDAO geUserDetailsDao(SessionFactory sessionFactory) {
	    	return new UserDAOImpl(sessionFactory);
	    }
}

