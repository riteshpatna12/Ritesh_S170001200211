package com.ichdbank.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.ichdbank.model.Customer;
import com.ichdbank.model.FundTransfer;

    @Repository
    public interface FundTransferDAO {

    public boolean transferFund(FundTransfer fundtransfer);
		
}
