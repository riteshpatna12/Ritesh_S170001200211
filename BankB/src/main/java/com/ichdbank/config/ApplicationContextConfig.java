package com.ichdbank.config;


import java.util.Properties;

import javax.sql.DataSource;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate4.LocalSessionFactoryBuilder;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.ichdbank.dao.AccountDAO;
import com.ichdbank.dao.AccountDAOImpl;
import com.ichdbank.dao.CustomerDAO;
import com.ichdbank.dao.CustomerDAOImpl;
import com.ichdbank.dao.FundTransferDAO;
import com.ichdbank.dao.FundTransferDAOImpl;
import com.ichdbank.model.Account;
import com.ichdbank.model.Customer;
import com.ichdbank.model.FundTransfer;


@Configuration
@ComponentScan("com.ichdbank")
@EnableTransactionManagement
public class ApplicationContextConfig {
	
	@Bean(name ="dataSource")
	public DriverManagerDataSource getDataSource(){
		
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
    	dataSource.setDriverClassName("org.h2.Driver");
    	dataSource.setUrl("jdbc:h2:tcp://localhost/~/dbBank");
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
	    	sessionBuilder.addAnnotatedClasses(Customer.class);
	    	sessionBuilder.addAnnotatedClasses(Account.class);
	    	sessionBuilder.addAnnotatedClasses(FundTransfer.class);
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
	    @Bean(name = "customerDAO")
	    public CustomerDAO geCustomerDao(SessionFactory sessionFactory) {
	    	return new CustomerDAOImpl(sessionFactory);
	    }
	    
	    @Autowired
	    @Bean(name = "accountDAO")
	    public AccountDAO geAccountDao(SessionFactory sessionFactory) {
	    	return new AccountDAOImpl(sessionFactory);
	    }
	    
	    @Autowired
	    @Bean(name = "fundTransferDAO")
	    public FundTransferDAO geFundTransferDao(SessionFactory sessionFactory) {
	    	return new FundTransferDAOImpl(sessionFactory);
	    }


	}