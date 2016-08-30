package com.ichdbank.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.ichdbank.model.FundTransfer;

public class FundTransferDAOImpl implements FundTransferDAO {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	public FundTransferDAOImpl(SessionFactory sessionFactory){
		this.sessionFactory=sessionFactory;
	}
	
	 public boolean transferFund(FundTransfer fundtransfer){
		 
		 try {
			  ((FundTransferDAOImpl) sessionFactory.getCurrentSession()).transferFund(fundtransfer);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
		 
	 }

	
	
